package org.example.collections;

import java.util.ArrayList;
import java.util.Collections;
public class ReverseTheOrderOfElementsInAnArrayList9 {



        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);

            System.out.println("Original ArrayList: " + numbers);

            // Reverse the order of elements
            Collections.reverse(numbers);

            System.out.println("Reversed ArrayList: " + numbers);
        }
    }



    /*

    To reverse the order of elements in an ArrayList in Java, you can use the `Collections` class from the `java.util` package. The `Collections` class provides a `reverse()` method that can be used to reverse the order of elements in a List, including an ArrayList. Here's an example:


In this example, we create an ArrayList named `numbers` and add some integer elements to it. Then, we print the original ArrayList. After that, we use the `Collections.reverse()` method to reverse the order of elements in the ArrayList. Finally, we print the reversed ArrayList.

The output of the above code will be:
```
Original ArrayList: [1, 2, 3, 4, 5]
Reversed ArrayList: [5, 4, 3, 2, 1]
```

As you can see, the order of elements in the ArrayList is reversed using the `Collections.reverse()` method.

     */
