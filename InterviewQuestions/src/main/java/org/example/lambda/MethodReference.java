package org.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {
    public static void main(String[] args) {


        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(System.out::println); // Method reference to print each name

        names.stream().map(String::toUpperCase).forEach(System.out::println);
    // .map(String::toUpperCase) // Method reference to convert to upper case
    // .collect(Collectors.toList());
    // System.out.println(upperCaseNames);

   /*  Mapping and Sorting
This example converts a list of strings to their lengths and sorts them in ascending order. */

names.stream().map(String::length).sorted().forEach(System.out::println);


//find max number  in list

List<Integer> numbers = Arrays.asList(3, 5, 1, 8, 2);
System.out.println(numbers.stream().max(Integer::compareTo).orElse(-1)); // Output: 8




/* Practice Questions
Filter and Collect: Write a program that filters a list of strings to include only those that start with the letter "A" and collects them into a new list.

Map and Uppercase: Given a list of names, convert all names to uppercase using the Stream API and print the result.

Sum of Elements: Calculate the sum of all integers in a list using the reduce() method.

Find Minimum: Write a program to find the minimum value in a list of integers.

Count Even Numbers: Count how many even numbers are present in a list of integers.

Distinct Elements: Write a program that removes duplicate strings from a list and collects them into a new list.

Flatten List: Given a list of lists of integers, flatten it into a single list of integers.

Group By Length: Group a list of strings by their lengths and print the resulting map.

Sort and Reverse: Write a program that sorts a list of integers in descending order.

Average Calculation: Calculate the average of a list of integers using the Stream API.

Filter and Map Combined: Write a program that filters out numbers less than 5 from a list, doubles the remaining numbers, and collects them into a new list.

Find First: Use the Stream API to find the first name in a list that contains the letter "e".

Join Strings: Join a list of strings into a single string, separated by commas.

Check All Match: Write a program that checks if all strings in a list are longer than 3 characters.

Check Any Match: Write a program that checks if any string in a list starts with "Z".

Reduce to Product: Calculate the product of all integers in a list using the reduce() method.

Find First Even Number: Find the first even number in a list of integers.

Sort by Length: Sort a list of strings based on their lengths and print the sorted list.

Convert List to Set: Convert a list of integers into a set to remove duplicates and print the result.

Method Reference for Printing: Use a method reference to print each element of a list of strings.
 */
    }

    


}
