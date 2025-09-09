package Matrix;

public class SetZeroMatrix {

//    व्याख्या:
//    पहले check करते हैं क्या first row या first column में 0 है, ताकि बाद में उन्हें zero कर सकें।
//
//    फिर matrix में बाकी element को चेक करके, 0 मिलने पर उस row और column की शुरुआत को 0 से mark करते हैं।
//
//    मार्किंग के बाद, फिर उस मार्किंग के आधार पर पूरे row या column को 0 से भर देते हैं।
//
//    अंत में, यदि पहली row या column में शुरू से 0 था, तो उसे भी 0 कर देते हैं।


    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Step 1: Check if first row has any zero
        for (int c = 0; c < cols; c++) {
            if (matrix[0][c] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Step 2: Check if first column has any zero
        for (int r = 0; r < rows; r++) {
            if (matrix[r][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Step 3: Use first row and column as markers for rows and cols to be zeroed
        for (int r = 1; r < rows; r++) {
            for (int c = 1; c < cols; c++) {
                if (matrix[r][c] == 0) {
                    matrix[r][0] = 0;  // Mark the row
                    matrix[0][c] = 0;  // Mark the column
                }
            }
        }

        // Step 4: Set zeros based on the markers in first row and column
        for (int r = 1; r < rows; r++) {
            for (int c = 1; c < cols; c++) {
                if (matrix[r][0] == 0 || matrix[0][c] == 0) {
                    matrix[r][c] = 0;
                }
            }
        }

        // Step 5: Zero out the first row if needed
        if (firstRowZero) {
            for (int c = 0; c < cols; c++) {
                matrix[0][c] = 0;
            }
        }

        // Step 6: Zero out the first column if needed
        if (firstColZero) {
            for (int r = 0; r < rows; r++) {
                matrix[r][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        SetZeroMatrix obj = new SetZeroMatrix();
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        obj.setZeroes(matrix);

        // Print the modified matrix
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }


}
