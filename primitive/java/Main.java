package primitive.java;

record Person(String name, int age) {
}

public class Main {
   public static void main(String[] args) {
       checkEquality();
       checkUpdates();
   } 

   static void checkEquality() {
       final var p1 = new Person("Raju", 30);
       final var p2 = new Person("Raju", 30);

       System.out.println(p1.equals(p2));
   }

   static void checkUpdates() {
       final var p1 = new Person("Raju", 30);

       takePerson(p1);
   }

   static void takePerson(final Person p2) {
       // is p2 different object that the called one?
   }
}