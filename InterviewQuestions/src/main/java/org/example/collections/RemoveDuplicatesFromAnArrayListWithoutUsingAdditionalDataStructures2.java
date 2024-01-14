package org.example.collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class RemoveDuplicatesFromAnArrayListWithoutUsingAdditionalDataStructures2 {






        public static void removeDuplicates(ArrayList<Integer> list) {
            int size = list.size();
            for (int i = 0; i < size - 1; i++) {
                Integer current = list.get(i);
                for (int j = i + 1; j < size; j++) {
                    if (current.equals(list.get(j))) {
                        list.remove(j);
                        size--;
                        j--;
                    }
                }
            }
        }

        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 3, 5, 6, 1));
            System.out.println("Original list: " + list);
            removeDuplicates(list);
            System.out.println("List without duplicates: " + list);
        }
    }



