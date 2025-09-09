package Matrix;

public class RotateImage {

//    कैसे काम करता है:
//    Transpose: matrix[i][j] और matrix[j][i] को swap किया जाता है, जिससे matrix का rows और columns का स्थान बदल जाता है।
//
//    Reverse Rows: हर row को उल्टा कर दिया जाता है, जिससे rotation complete होता है।

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix (rows और columns को swap करना)
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: हर row को उल्टा (reverse) करें
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        RotateImage obj = new RotateImage();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        obj.rotate(matrix);

        // Print the rotated matrix
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

}
