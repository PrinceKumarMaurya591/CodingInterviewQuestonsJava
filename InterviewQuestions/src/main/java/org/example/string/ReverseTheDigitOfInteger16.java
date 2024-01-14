package org.example.string;


public class ReverseTheDigitOfInteger16 {



        public static int reverse(int num) {
            int reversed = 0;

            while (num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }

            return reversed;
        }

        public static void main(String[] args) {
            int num = 12345;
            int reversedNum = reverse(num);
            System.out.println("Reversed Integer: " + reversedNum);
        }
    }



    /*

    To reverse the digits of an integer, you can follow the following approach in Java:


Explanation:
1. We define a class named `ReverseInteger` to encapsulate the code related to reversing an integer.
2. The `reverse` method takes an integer (`num`) as input and returns the reversed integer.
3. We initialize a variable `reversed` to store the reversed integer, initially set to 0.
4. We enter a while loop that continues until `num` becomes 0.
5. In each iteration, we extract the last digit of `num` by using the modulo operator `%` with 10.
6. We multiply `reversed` by 10 and add the extracted digit to it, effectively building the reversed number.
7. We divide `num` by 10 to remove the last digit and continue with the next digit in the next iteration.
8. Once `num` becomes 0, we have reversed all the digits.
9. We return the `reversed` integer.
10. In the `main` method, we initialize an integer `num` with a sample value (e.g., 12345).
11. We call the `reverse` method and store the reversed integer in `reversedNum`.
12. Finally, we print the reversed integer using `System.out.println()`.

This code effectively reverses the digits of an integer by extracting the last digit in each iteration and building the reversed number.

     */
