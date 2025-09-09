package String;

public class ReverseWordsinaString {

    public String reverseWords(String s) {
        // 1. string के शुरू और अंत से सफेद जगह (spaces) हटाएं और बीच के extra spaces को एक से कम करें
        String[] words = s.trim().split("\\s+");
        // 2. words array को उल्टा करें
        StringBuilder reversed = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" "); // शब्दों के बीच एक space जोड़ें
            }
        }


        return reversed.toString();
    }

    public static void main(String[] args) {
        ReverseWordsinaString obj = new ReverseWordsinaString();
        String s = "  Hello   World  ";
        String result = obj.reverseWords(s);
        System.out.println("Reversed words: '" + result + "'");
    }
}
