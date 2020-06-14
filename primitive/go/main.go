package main

import "fmt"

// Person type
type Person struct {
	Name string
	Age  int
}

func main() {
	validateEquality()
	validateCopy()
}

func validateEquality() {
	p1 := Person{"Raju", 30}
	p2 := Person{"Raju", 30}
	println(p1 == p2) // true
}

func validateCopy() {
	p1 := Person{"Raju", 30}
	callMe(p1)

	fmt.Println(p1.Age) // will still be 30 and not 31
}

func callMe(p2 Person) {
	p2.Age++
}
