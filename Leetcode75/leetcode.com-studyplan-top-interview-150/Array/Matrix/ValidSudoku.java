package Matrix;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

//    कैसे काम करता है:
//    तीन arrays बनाए हैं rows, cols, और boxes, जो हर row, column, और box में आए नंबरों को ट्रैक करते हैं।
//
//    हर cell में जाकर देखें कि नंबर पहले से कहीं आया है या नहीं (row, column, box में)।
//
//    अगर कहीं डुप्लिकेट मिलेगा तो तुरंत false लौटाओ।
//
//    सब चेक कर के अगर कोई error नहीं मिली तो true लौटाओ।


    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] row = new HashSet[9];
        Set<Character>[] col = new HashSet[9];
        Set<Character>[] box = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;// खाली खानों को स्किप करें

                //row check
                if (row[i].contains(c)) return false;// अगर row में पहले से मौजूद है तो false रिटर्न करें
                row[i].add(c);// row में character को जोड़ें

                //col check
                if (col[j].contains(c)) return false;
                col[j].add(c);

                //box check
                int boxIndex = (i / 3) * 3 + (j / 3);// 0-2,3-5,6-8
                if (box[boxIndex].contains(c)) return false;// अगर box में पहले से मौजूद है तो false रिटर्न करें
                box[boxIndex].add(c);
            }
        }

        return true;


    }

    public static void main(String[] args) {
        ValidSudoku obj = new ValidSudoku();
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '6', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        boolean result = obj.isValidSudoku(board);
        System.out.println("Is the Sudoku board valid? " + result); // Output: true
    }
}
