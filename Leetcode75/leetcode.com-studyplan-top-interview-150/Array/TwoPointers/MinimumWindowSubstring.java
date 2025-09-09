package TwoPointers;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        Map<Character, Integer> dictT = new HashMap<>();
        for (char c : t.toCharArray()) {
            dictT.put(c, dictT.getOrDefault(c, 0) + 1);
        }

        int required = dictT.size();

        // (window counts) sliding window में हर character की गिनती
        Map<Character, Integer> windowCounts = new HashMap<>();

        int left = 0, right = 0;
        int formed = 0;  // जितने unique characters तर्कसंगत数量 में हैं

        int[] ans = {-1, 0, 0};  // length, left, right index of smallest window

        while (right < s.length()) {
            char c = s.charAt(right);
            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);

            if (dictT.containsKey(c) && windowCounts.get(c).intValue() == dictT.get(c).intValue()) {
                formed++;
            }

            // जब window तर्कसंगत हो
            while (left <= right && formed == required) {
                c = s.charAt(left);

                // Update smallest window
                if (ans[0] == -1 || right - left + 1 < ans[0]) {
                    ans[0] = right - left + 1;
                    ans[1] = left;
                    ans[2] = right;
                }

                windowCounts.put(c, windowCounts.get(c) - 1);
                if (dictT.containsKey(c) && windowCounts.get(c).intValue() < dictT.get(c).intValue()) {
                    formed--;
                }
                left++;
            }
            right++;
        }

        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }


    public static void main(String[] args) {
        MinimumWindowSubstring obj = new MinimumWindowSubstring();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = obj.minWindow(s, t);
        System.out.println("Minimum window substring: " + result); // Output: "BANC"
    }

}
