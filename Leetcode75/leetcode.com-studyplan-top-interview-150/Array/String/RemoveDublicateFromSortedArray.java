package String;

public class RemoveDublicateFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 5};
        int newLength = removeDuplicates(nums);
        System.out.println("New length: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int uniqueIndex = 1; // Pointer for the position of the next unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Check if the current element is different from the previous one
                nums[uniqueIndex] = nums[i]; // Place the unique element at the uniqueIndex
                uniqueIndex++; // Move the pointer to the next position
            }
        }
        return uniqueIndex; // The length of the array with unique elements
    }
}
