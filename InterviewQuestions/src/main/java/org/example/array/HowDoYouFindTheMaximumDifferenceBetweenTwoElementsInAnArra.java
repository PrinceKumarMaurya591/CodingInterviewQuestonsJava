package org.example.array;

public class HowDoYouFindTheMaximumDifferenceBetweenTwoElementsInAnArra {


        public static int findMaxDifference(int[] array) {
            int maxDifference = Integer.MIN_VALUE;
            int minElement = array[0];

            for (int i = 1; i < array.length; i++) { 
            	
                int currentDifference = array[i] - minElement;
                if (currentDifference > maxDifference) {
                    maxDifference = currentDifference;
                }
                if (array[i] < minElement) {
                    minElement = array[i];
                }
            }

            return maxDifference;
        }

        public static void main(String[] args) {
            int[] array = { 2, 5, 1, 7, 3, 9, 5 }; // Sample array
            int maxDifference = findMaxDifference(array);
            System.out.println("The maximum difference is: " + maxDifference);
        }
    }
