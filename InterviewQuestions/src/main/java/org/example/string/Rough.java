package org.example.string;

public class Rough {
    public static String findPalindrome(int[][] arr) {
        int n = arr.length;
        
        // Check rows for palindrome
        for (int i = 0; i < n; i++) {
            if (isPalindrome(arr[i])) {
                return i + " R";
            }
        }

        // Check columns for palindrome
        for (int j = 0; j < n; j++) {
            int[] column = new int[n];
            for (int i = 0; i < n; i++) {
                column[i] = arr[i][j];
            }
            if (isPalindrome(column)) {
                return j + " C";
            }
        }

        return "-1";
    }

    private static boolean isPalindrome(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] != array[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arr1 = {
            {1, 0, 0, 1},
            {0, 1, 1, 0},
            {1, 1, 1, 1},
            {0, 1, 1, 0}
        };
        
        int[][] arr2 = {
            {1, 0, 0, 1},
            {0, 1, 1, 0},
            {1, 1, 1, 1},
            {1, 0, 0, 1}
        };
        
        int[][] arr3 = {
            {1, 0, 0, 1},
            {0, 1, 1, 0},
            {1, 1, 1, 1},
            {1, 0, 0, 0}
        };
        
        System.out.println(findPalindrome(arr1)); // Output: 0 R
        System.out.println(findPalindrome(arr2)); // Output: 0 R
        System.out.println(findPalindrome(arr3)); // Output: -1
    }
}
