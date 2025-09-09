package String;

public class RemoveDUplicatesFromSortedArray2 {
public int removeDuplicates(int[] nums) {
     if (nums.length <= 2) return nums.length;
    int insertPos = 2; // शुरुआत में पहले 2 elements अपने आप ठीक हैं
    for (int i = 2; i < nums.length; i++) {
        // अगर current element उस element से अलग है जो insertPos-2 पर है,
        // तो उसे insertPos पर रखें और insertPos बढ़ाएं
        if (nums[i] != nums[insertPos - 2]) {
            nums[insertPos] = nums[i];
            insertPos++;
        }
    }
    return insertPos; // नई length जिसमें duplicates 2 से ज्यादा नहीं हैं

}

public static void main(String[] args) {
    RemoveDUplicatesFromSortedArray2 obj = new RemoveDUplicatesFromSortedArray2();
    int[] nums = {1, 1, 1, 2, 2, 3};
    int newLength = obj.removeDuplicates(nums);
    System.out.println("New length: " + newLength);
    System.out.print("Modified array: ");
    for (int i = 0; i < newLength; i++) {
        System.out.print(nums[i] + " ");
    }
}
}
