package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//हिंदी में समझाइश:
//        सबसे पहले array को sort किया जाता है ताकि दो pointers तकनीक अपनाई जा सके।
//
//        एक loop से हर element को fix करें (nums[i]) और बाकी दो element खोजें जो 0 - nums[i] के बराबर हों।
//
//        दो pointers left और right से शुरुआत करें, और sum की वैल्यू देखें:
//
//        अगर sum 0 हुआ, तो तीनों element को रिजल्ट में जोड़ें।
//
//        अगर sum < 0, तो left pointer आगे बढ़ाएँ ताकि sum बढ़े।
//
//        अगर sum > 0, तो right pointer पीछे करें ताकि sum कम हो।
//
//        duplicates हटाने के लिए pointers को सही ढंग से एडजस्ट करें।
//
//        उदाहरण:
//        Input: [-1,0,1,2,-1,-4]
//        Output: [[-1,-1,2],[-1,0,1]]
//
//        यह तरीका O(n^2) time complexity में काम करता है और duplicates को संभालता है।
public class Sum3 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // सबसे पहले array को sort करें

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // duplicates को skip करें

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++; // duplicates को skip करें
                    while (left < right && nums[right] == nums[right - 1]) right--; // duplicates को skip करें
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Sum3 obj = new Sum3();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> triplets = obj.threeSum(nums);
        System.out.println("Triplets that sum to zero: " + triplets);
    }

}
