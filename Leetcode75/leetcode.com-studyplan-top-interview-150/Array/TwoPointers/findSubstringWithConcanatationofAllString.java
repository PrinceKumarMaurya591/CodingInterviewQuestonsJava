package TwoPointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//HashMap बनाओ words के counts के लिए सिर्फ एक बार
//
//        हर window को देखो, हर बार HashMap ना बनाओ
//
//        शुरू करने के लिए wordLen के different offsets से कोशिश करो
//
//        यानी 0 से wordLen तक के सभी possible start points टे्स्ट करो
//
//        दो pointers ("left" और "right") से window move करो
//
//        अगर अचानक कोई invalid word मिले तो पूरे window को reset करो, बार-बार न कबूल करो
public class findSubstringWithConcanatationofAllString {

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;

        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < wordLen; i++) {
            int left = i, right = i, count = 0;
            Map<String, Integer> currentMap = new HashMap<>();

            while (right + wordLen <= s.length()) {
                String word = s.substring(right, right + wordLen);
                right += wordLen;

                if (wordMap.containsKey(word)) {
                    currentMap.put(word, currentMap.getOrDefault(word, 0) + 1);
                    count++;

                    while (currentMap.get(word) > wordMap.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        currentMap.put(leftWord, currentMap.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }

                    if (count == wordCount) {
                        result.add(left);
                    }
                } else {
                    currentMap.clear();
                    count = 0;
                    left = right;
                }
            }
        }

        return result;
    }


//    जब भी नया word मिले, तो window में count बढ़ाओ।
//
//    अगर कोई word ज्यादा बार मिल गया, तो window को छोटा करो (left pointer को आगे बढ़ाओ)।
//
//    अगर कोई ऐसा word मिले जो words में है ही नहीं तो window पूरी तरह से reset करो।
//
//    कम से कम हर बार HashMap को बार-बार recreate नहीं करना चाहिए – सिर्फ clear कर सकते हैं!

    public static void main(String[] args) {
        findSubstringWithConcanatationofAllString obj = new findSubstringWithConcanatationofAllString();
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        List<Integer> result = obj.findSubstring(s, words);
        System.out.println("Starting indices of substring: " + result); // Output: [0, 9]
    }

}
