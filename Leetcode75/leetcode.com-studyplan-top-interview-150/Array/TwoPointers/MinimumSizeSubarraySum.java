package TwoPointers;

public class MinimumSizeSubarraySum {

    //इसका सबसे अच्छा तरीका है, sliding window method:
//    शुरुआत में दोनों pointer (left, right) array के शुरुआत में रखें।
//
//    right pointer से elements को जोड़ते जाएँ और देखिए कि sum target से कम है या नहीं।
//
//    जब sum target से ज्यादा या बराबर हो जाए, तो कोशिश करें कि subarray छोटा किया जाए:
//
//    यानी left pointer आगे बढ़ाएँ और उसके element को sum से घटाएँ।
//
//    हर बार जब sum target के बराबर या ज्यादा हो जाए, तो इस window की लंबाई minLength में देखें और record करें।
//
//    पूरा array निकलने के बाद, अगर कोई answer मिला है तो return करें, नहीं तो 0 return करें।

    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int currentSum = 0;

        for (int right = 0; right < n; right++) {
            currentSum += nums[right];

            while (currentSum >= target) {
                minLength = Math.min(minLength, right - left + 1);// update minLength

                currentSum -= nums[left];// shrink the window from the left
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;// if no valid subarray found, return 0
    }

    public static void main(String[] args) {
        MinimumSizeSubarraySum obj = new MinimumSizeSubarraySum();
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        int result = obj.minSubArrayLen(target, nums);
        System.out.println("Minimum length of subarray: " + result); // Output: 2
    }

}
