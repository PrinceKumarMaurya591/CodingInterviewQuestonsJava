package org.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



class Person{

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public class SortAnArrayListOfCustomObjectsBasedOnASpecificField12 {
        public static void main(String[] args) {
            ArrayList<Person> people = new ArrayList<>();
            people.add(new Person("John", 30));
            people.add(new Person("Alice", 25));
            people.add(new Person("Bob", 35));

            // Sort the ArrayList based on the age field
            Collections.sort(people, new Comparator<Person>() {
                @Override
                public int compare(Person p1, Person p2) {
                    return Integer.compare(p1.getAge(), p2.getAge());
                }
            });

            // Print the sorted ArrayList
            for (Person person : people) {
                System.out.println(person.getName() + " - " + person.getAge());
            }
        }
    }

/*

To sort an `ArrayList` of custom objects based on a specific field, you can use the `Collections.sort()` method in Java along with a custom `Comparator`. Here's an example:



In this example, we have a `Person` class with `name` and `age` fields. We create an `ArrayList` of `Person` objects and populate it with some elements.

To sort the `ArrayList` based on the `age` field, we use the `Collections.sort()` method. We pass in a custom `Comparator` object as the second argument. The `Comparator` compares two `Person` objects based on their ages using the `compare()` method.

After sorting, we iterate over the sorted `ArrayList` and print the names and ages of each `Person` object.

The output will be:

```
Alice - 25
John - 30
Bob - 35
```

The `Collections.sort()` method modifies the original `ArrayList` in-place, sorting it based on the defined comparison logic provided by the `Comparator`.

 */
