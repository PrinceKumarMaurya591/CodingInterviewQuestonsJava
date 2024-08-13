package org.example.array;

public class HowDoYouRotateAnArrayByAGivenNumberOfPositions {
	
	

    public static int minJumps(int[] arr) {
        int n = arr.length;
        if (n == 0 || arr[0] == 0) {
            return -1; // If array is empty or first element is 0, we cannot move anywhere
        }

        // Initialize variables
        int jumps = 0; // Number of jumps needed to reach the end
        int maxReach = 0; // The farthest we can reach at any point
        int steps = 0; // Steps we can still take

        for (int i = 0; i < n; i++) {
            // Check if we have reached the end of the array
            if (i == n - 1) {
                return jumps;
            }

            // Update the maximum reach
            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;

            // If no steps are left
            if (steps == 0) {
                jumps++;

                // Check if the current position is beyond the max reachable position
                if (i >= maxReach) {
                    return -1;
                }

                // Reinitialize the steps to the amount of steps to reach maxReach from position i
                steps = maxReach - i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr1)); // Expected output: 3

        int[] arr2 = {1, 4, 3, 2, 6, 7};
        System.out.println(minJumps(arr2)); // Expected output: 2

        int[] arr3 = {0, 10, 20};
        System.out.println(minJumps(arr3)); // Expected output: -1
    }
}
