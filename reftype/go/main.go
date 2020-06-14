package main

import (
	"fmt"
	"reflect"

	"github.com/madhanganesh/immutable-type/reftype/go/model"
)

func main() {
	p1 := model.New("madhan", 43, []string{"tag1"})
	p2 := model.New("madhan", 43, []string{"tag1"})

	// fmt.Println(p1 == p2) // error

	fmt.Println(reflect.DeepEqual(p1, p2)) // true

	callMe(p1)
	fmt.Println(p1) // {madhan 43 [tag1]}
}

func callMe(p model.Person) {
	s := p.Tags() // gets a new object while accessing Tags
	s = append(s, "new")
}
