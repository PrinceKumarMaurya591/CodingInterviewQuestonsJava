package TwoPointers;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstringWithoutRepeatingChar {


    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else { //अगर set में character है:
                set.remove(s.charAt(left));//यानी duplicate character मिल गया, तो बाएँ वाला character set से हटा कर left को आगे बढ़ाओ।
                left++;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstringWithoutRepeatingChar obj = new LengthOfLongestSubstringWithoutRepeatingChar();
        String s = "abcabcbb";
        int result = obj.lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring without repeating characters: " + result); // Output: 3
    }

}
