package reftype.java;

import java.util.Arrays;

record Person(String name, int age, String[] tags) {
    public String[] tags() {
        return tags.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
      if (!(obj instanceof Person)) return false;
      Person that = (Person) obj;
      if (this.name == that.name && 
            this.age == that.age && 
            Arrays.equals(this.tags, that.tags)) 
        return true;
      return false;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, Tags: %s", name, age, Arrays.toString(tags));
    }
}

public class Main {
   public static void main(String[] args) {
       checkEquality();
       checkUpdates();
   } 

   static void checkEquality() {
       final var p1 = new Person("Raju", 30, new String[]{"tag1"});
       final var p2 = new Person("Raju", 30, new String[]{"tag1"});

       System.out.println(p1.equals(p2));
   }

   static void checkUpdates() {
       final var p1 = new Person("Raju", 30, new String[]{"tag1"});

       takePerson(p1);

       System.out.println(p1.tags()[0]); // Person[name=Raju, age=30, tags=[tag1, tag2]]
   }

   static void takePerson(final Person p2) {
       p2.tags()[0] = "changed";
   }
}