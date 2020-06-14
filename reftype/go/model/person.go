package model

// Person type
type Person struct {
	Name string
	Age  int
	tags []string
}

// Tags property
func (p *Person) Tags() []string {
	arr := make([]string, len(p.tags))
	copy(arr, p.tags)
	return arr
}

// New func
func New(name string, age int, tags []string) Person {
	return Person{Name: name, Age: age, tags: tags}
}
