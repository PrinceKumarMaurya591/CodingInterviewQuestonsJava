package String;

public class RemoveElements {

    public static void main(String[] args) {
        String str = "hello world";
        char ch = 'o';
        String result = removeCharacter(str, ch);
        System.out.println(result); // Output: hell wrld
    }

    public static String removeCharacter(String str, char ch) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) != ch) {
//            यह condition चेक करती है कि current character ch नहीं है। अगर current character हटाने वाला character नहीं है तो...
//                sb.append(str.charAt(i));
//...उस character को StringBuilder में जोड़ दिया जाएगा ताकि वह नई स्ट्रिंग का हिस्सा बने।
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

}
