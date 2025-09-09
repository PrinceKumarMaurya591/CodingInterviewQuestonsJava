package TwoPointers;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        int sIndex = 0, tIndex = 0;

        while (sIndex < sLen && tIndex < tLen) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++; // अगर मैच हो तो s का index बढ़ाएं
            }
            tIndex++; // हमेशा t का index बढ़ाएं
        }

        return sIndex == sLen; // अगर s के सारे characters मिल गए हैं तो true रिटर्न करें
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t)); // Output: true

        s = "axc";
        t = "ahbgdc";
        System.out.println(isSubsequence(s, t)); // Output: false
    }
}
