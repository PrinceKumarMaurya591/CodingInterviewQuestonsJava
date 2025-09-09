package String;

public class ProductofArrayExceptSelf {

    // O(n) time and O(1) space solution (output array not counted as extra space)
    // left and right product approach
    // left product of each element and right product of each element
    // multiply both to get the result
    // left product of first element is 1
    // right product of last element is 1
    // left product of i = left product of i-1 * nums[i-1]
//    हिंदी व्याख्या:
//    result = 1 से शुरू करते हैं क्योंकि पहले index के लिए left side में कोई element नहीं है।
//
//    पहली for-loop में हम हर index पर left side के सारे elements का प्रोडक्ट result array में भरते हैं। उदाहरण के लिए, index 2 पर result में होगा nums * nums।
//
//    इसके बाद right side के प्रोडक्ट को rightProduct variable में रखते हुए, दूसरी for-loop में rightProduct को result के हर element से multiply करते हैं ताकि दोनों तरफ के प्रोडक्ट मिल जाएं।
//
//    rightProduct को बाद में update करते हैं जिससे आगे वाले index के लिए सही right प्रोडक्ट बने।
//
//    अंत में result में हर index पर वह प्रोडक्ट आ जाता है जो उस index के अलावा बाकी elements का है।
//
//    उदाहरण:
//    Input:
//    Output:
//
//    पहले index के लिए (234) = 24
//
//    दूसरे के लिए (134) = 12
//
//    तीसरे के लिए (124) = 8
//
//    चौथे के लिए (123) = 6
//
//    यह समाधान O(n) समय और O(1) अतिरिक्त जगह (output को छोड़कर) में काम करता है।



    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        // Step 1: Calculate left products
        output[0] = 1; // पहले element के लिए left product 1 है
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        // Step 2: Calculate right products and multiply with left products
        int rightProduct = 1; // सबसे दाहिने element के लिए right product 1 है
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= rightProduct; // left product के साथ multiply करें
            rightProduct *= nums[i]; // right product अपडेट करें
        }

        return output;
    }

    public static void main(String[] args) {
        ProductofArrayExceptSelf obj = new ProductofArrayExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] result = obj.productExceptSelf(nums);
        System.out.print("Output array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}
