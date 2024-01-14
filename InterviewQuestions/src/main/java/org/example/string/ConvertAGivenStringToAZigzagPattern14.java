package org.example.string;

public class ConvertAGivenStringToAZigzagPattern14 {


        public static String convert(String s, int numRows) {
            // Special cases where numRows is 1 or the string is empty
            if (numRows == 1 || s.length() == 0) {
                return s;
            }

            StringBuilder[] rows = new StringBuilder[numRows];
            for (int i = 0; i < numRows; i++) {
                rows[i] = new StringBuilder();
            }

            int currRow = 0;
            boolean goingDown = false;

            for (char c : s.toCharArray()) {
                rows[currRow].append(c);

                // Change direction when reaching the first or last row
                if (currRow == 0 || currRow == numRows - 1) {
                    goingDown = !goingDown;
                }

                currRow += goingDown ? 1 : -1;
            }

            StringBuilder result = new StringBuilder();
            for (StringBuilder row : rows) {
                result.append(row);
            }

            return result.toString();
        }

        public static void main(String[] args) {
            String input = "PAYPALISHIRING";
            int numRows = 3;
            String zigzag = convert(input, numRows);
            System.out.println("ZigZag Conversion: " + zigzag);
        }
    }



    /*

    The ZigZag Conversion problem involves converting a given string into a zigzag pattern based on a specified number of rows. Here's an example implementation in Java:

Explanation:
1. The `convert` method takes a string `s` and the number of rows `numRows` as input and returns the string in zigzag pattern.
2. Special cases are handled first: if `numRows` is 1 or the string is empty, the original string is returned as there won't be any changes.
3. An array of `StringBuilder` objects is created to represent each row of the zigzag pattern.
4. The variable `currRow` keeps track of the current row, and `goingDown` is a boolean flag indicating the direction of traversal.
5. A loop iterates over each character of the string.
6. The current character is appended to the `StringBuilder` of the current row (`rows[currRow]`).
7. The direction is changed when reaching the first or last row (`currRow == 0` or `currRow == numRows - 1`), toggling the `goingDown` flag.
8. The `currRow` is incremented or decremented based on the direction.
9. After processing all characters, a separate `StringBuilder` named `result` is used to concatenate the `StringBuilder` objects of each row in order.
10. Finally, the result is converted to a string using `result.toString()` and returned.
11. In the `main` method, a sample input string (`PAYPALISHIRING`) and number of rows (`3`) are used to demonstrate the zigzag conversion.
12. The converted string is printed as output.

The ZigZag Conversion algorithm forms a pattern where characters of the input string are arranged in a zigzag manner, going back and forth between rows. By appending characters to the appropriate rows and managing the traversal direction, the converted string can be obtained.

     */
