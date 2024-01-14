package org.example.string;


import java.util.Stack;
public class CheckIfAGivenStringOfParenthesesIsValid10 {



        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false; // If an invalid closing parenthesis is encountered or stack is empty
                }
            }

            return stack.isEmpty(); // Return true if all parentheses are matched and stack is empty
        }

        public static void main(String[] args) {
            String s1 = "()";
            String s2 = "()[]{}";
            String s3 = "(]";
            String s4 = "([)]";
            String s5 = "{[]}";

            System.out.println(s1 + " is valid: " + isValid(s1));
            System.out.println(s2 + " is valid: " + isValid(s2));
            System.out.println(s3 + " is valid: " + isValid(s3));
            System.out.println(s4 + " is valid: " + isValid(s4));
            System.out.println(s5 + " is valid: " + isValid(s5));
        }
    }



    /*

To check if a given string of parentheses is valid, you can use a stack data structure to keep track of opening parentheses. Here's the Java code to solve this problem:



Explanation:
1. We define a class named `ValidParentheses` to encapsulate the code related to checking the validity of parentheses.
2. The `isValid` method takes a string (`s`) as input and returns a boolean value indicating whether the parentheses in the string are valid or not.
3. We create a stack of characters (`stack`) to store the opening parentheses encountered.
4. We iterate through each character in the input string using a for-each loop.
5. If an opening parenthesis (`'('`, `'{'`, or `'['`) is encountered, we push it onto the stack.
6. If a closing parenthesis (`')'`, `'}'`, or `']'`) is encountered, we check if the stack is not empty and the top element of the stack matches the expected opening parenthesis. If it does, we pop the top element from the stack.
7. If the encountered character is neither an opening parenthesis nor a valid closing parenthesis, we return `false` as it is an invalid input.
8. After iterating through all characters, we check if the stack is empty. If it is, all parentheses have been matched, and we return `true`. Otherwise, there are unmatched parentheses, and we return `false`.
9. In the `main` method, we test the `isValid` method with different strings (`s1`, `s2`, `s3`, `s4`, `s5`) and print the validity result.

This code efficiently checks the validity of parentheses in a given string using a stack data structure. It ensures that the opening and closing parentheses are matched correctly and returns `true` if the string is valid, and `false` otherwise.

     */
