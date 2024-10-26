package org.example.string;

import java.util.HashMap;

class Solution {
    // Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (map1.containsKey(char1)) {
                if (map1.get(char1) != char2) {
                    return false;
                }
            } else {
                map1.put(char1, char2);
            }

            if (map2.containsKey(char2)) {
                if (map2.get(char2) != char1) {
                    return false;
                }
            } else {
                map2.put(char2, char1);
            }
        }

        return true;
    }
}

public class Rough {
    public static void main(String[] args) {
        String str1 = "egg";
        String str2 = "add";
        System.out.println("Are '" + str1 + "' and '" + str2 + "' isomorphic? " + Solution.areIsomorphic(str1, str2));

        str1 = "foo";
        str2 = "bar";
        System.out.println("Are '" + str1 + "' and '" + str2 + "' isomorphic? " + Solution.areIsomorphic(str1, str2));

        str1 = "paper";
        str2 = "title";
        System.out.println("Are '" + str1 + "' and '" + str2 + "' isomorphic? " + Solution.areIsomorphic(str1, str2));

        str1 = "abc";
        str2 = "def";
        System.out.println("Are '" + str1 + "' and '" + str2 + "' isomorphic? " + Solution.areIsomorphic(str1, str2));
    }
}
