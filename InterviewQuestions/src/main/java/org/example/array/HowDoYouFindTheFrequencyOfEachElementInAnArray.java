
package org.example.array;


import java.util.HashMap;
import java.util.Map;
public class HowDoYouFindTheFrequencyOfEachElementInAnArray {


        public static Map<Integer, Integer> findFrequency(int[] array) {
            Map<Integer, Integer> frequencyMap = new HashMap<>();

            for (int element : array) {
                frequencyMap.put(element, frequencyMap.getOrDefault(element,0)+1);
            }

            return frequencyMap;
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 2, 4, 1, 3, 5, 2, 1};
            Map<Integer, Integer> frequencyMap = findFrequency(array);

            for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
            }
        }
    }
