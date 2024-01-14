package org.example.array;

public class HowDoYouFindTheMissingNumberInAnArrayContainingNumbersFrom1ToN {


        public static int findMissingNumber(int[] nums) {
            int n = nums.length + 1; // Total number of elements in the sequence (including the missing number)
            int totalSum = (n * (n + 1)) / 2; // Sum of all numbers from 1 to N
            int actualSum = 0; // Sum of elements in the array

            for (int num : nums) {
                actualSum += num; // Calculate the sum of elements in the array
            }

            int missingNumber = totalSum - actualSum; // Calculate the missing number

            return missingNumber;
        }

        public static void main(String[] args) {
            int[] nums = { 1, 2, 4, 6, 3, 7, 8 }; // Sample array with a missing number
            int missingNumber = findMissingNumber(nums); // Call findMissingNumber() method
            System.out.println("The missing number is: " + missingNumber);
        }
    }


