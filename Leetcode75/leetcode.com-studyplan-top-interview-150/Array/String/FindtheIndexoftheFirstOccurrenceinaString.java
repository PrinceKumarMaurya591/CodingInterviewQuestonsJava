package String;

public class FindtheIndexoftheFirstOccurrenceinaString {

//    काम करने का तरीका:
//    सबसे पहले चेक करते हैं अगर needle खाली है तो रिजल्ट 0 होता है।
//
//    फिर haystack में iterate करते हैं उन सारे स्थानों पर जहाँ से needle पूरी तरह फिट हो सके।
//
//    हर जगह haystack का substring लेकर needle के बराबर चेक करते हैं।
//
//    अगर मिलता है तो उस index को रिटर्न करते हैं।
//
//    अगर पूरा loop चल जाने के बाद भी मैच न मिले तो -1 रिटर्न करते हैं।


    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0; // अगर needle खाली है तो 0 रिटर्न करें
        int hLen = haystack.length();
        int nLen = needle.length();

        for (int i = 0; i <= hLen - nLen; i++) {
            // haystack के हर substring की जांच करें जो needle के बराबर हो सकता है
            if (haystack.substring(i, i + nLen).equals(needle)) {
                return i; // पहला मिलान मिलने पर उसका index रिटर्न करें
            }
        }
        return -1; // अगर कोई मिलान नहीं मिला तो -1 रिटर्न करें
    }

    public static void main(String[] args) {
        FindtheIndexoftheFirstOccurrenceinaString obj = new FindtheIndexoftheFirstOccurrenceinaString();
        String haystack = "hello";
        String needle = "ll";
        int index = obj.strStr(haystack, needle);
        System.out.println("Index of first occurrence: " + index);
    }
}
