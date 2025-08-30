
public class RemoveDublicate1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 4, 5, 3};
        System.out.println("Original array: ");
        int newLength = removeDuplicates(nums);
        System.out.println("New length: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }


    // Function to remove duplicates from a not sorted array
    // Time Complexity: O(n), where n is the number of elements in the array
    public static int removeDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>(); 
        List<Integer> uniqueList = new ArrayList<>();
        for (int num : nums) {
            if (seen.add(num)) { // add returns false if the element was already present
                uniqueList.add(num);
            }
        }
        for (int i = 0; i < uniqueList.size(); i++) {
            nums[i] = uniqueList.get(i);
        }
        return uniqueList.size();
    }
}
