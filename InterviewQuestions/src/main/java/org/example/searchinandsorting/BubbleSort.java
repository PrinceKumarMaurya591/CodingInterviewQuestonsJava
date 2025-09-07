package org.example.searchinandsorting;

import java.util.Arrays;

public class BubbleSort {


        public static void bubbleSort(int[] array) {
            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }

        public static void main(String[] args) {
            int[] array = { 5, 2, 8, 12, 1 };
            bubbleSort(array);
            System.out.println("Sorted array: " + Arrays.toString(array));
        }
    }


मुख्य idea है हर पास में array के adjacent elements की तुलना करना और जरुरत हो तो swap करना ताकि बड़े elements बबल की तरह आखिरी में चले जाएं।

काम करने की प्रक्रिया:
बाहरी लूप i 0 से n-2 तक चलता है, जिससे हर पास होता है।

अंदरूनी लूप j 0 से n-i-2 तक चलता है, क्योंकि हर पास में आखिरी के i elements पहले से sorted हो जाते हैं।

array[j] और array[j+1] की तुलना होती है, अगर आगे वाला छोटा हो तो swap कर देते हैं।

इस प्रक्रिया से धीरे-धीरे सबसे बड़े elements array के आखिर में पहुंच जाते हैं।

आउटपुट
जब main में दिया गया array {5, 2, 8, 12, 1} को sort करेंगे, तो sorted output होगा:

text
Sorted array: [1, 2, 5, 8, 12]
Time Complexity
Worst-case और Average-case: O(n2), क्योंकि nested loops के कारण।

Best-case: O(n2) (optimized version में अगर array पहले से sorted हो तो early exit की सुविधा हो सकती है)।

Space Complexity
O(1), क्योंकि यह in-place sorting है, कोई अतिरिक्त array नहीं बनता।
