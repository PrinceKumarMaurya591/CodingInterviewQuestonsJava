package Matrix;

public class GameOfLife {


//    Conway's Game of Life की problem में, आपको m x n के grid में cells का current state दिया होता है, जहां हर cell या तो live (1) या dead (0) होता है। आपको board को update करना है अगले generation की स्थिति में, नियमों के अनुसार।
//
//    नियम:
//    किसी live cell के कम से कम 2 और अधिकतम 3 live पड़ोसी हों तो वह जिंदा रहता है, नहीं तो मर जाता है।
//
//    किसी dead cell के ठीक 3 live पड़ोसी हों तो वह जिंदा हो जाता है।
//
//    बाकी सभी cases में cell dead होता है।
//
//    In-place solution की चुनौती:
//    चूंकि सभी cells को एक साथ अपडेट करना होता है, सीधा update करने से दूसरे cells के लिए गलत पड़ सकता है।
//
//    इसलिए state transition को encode करने के लिए intermediate states का उपयोग करते हैं।
//
//     2 का मतलब है cell अभी live था लेकिन मर जाएगा।
//
//        3 का मतलब है cell अभी dead था लेकिन जिंदा हो जाएगा।
//
//    इन intermediate states की मदद से एक ही पास में सभी cells को अपडेट कर सकते हैं।
//
//    पूरा board अपडेट हो जाने के बाद intermediate states को final states में बदल दिया जाता है।
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[][] directions = {{-1,-1}, {-1,0}, {-1,1}, {0,-1}, {0,1}, {1,-1}, {1,0}, {1,1}};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveNeighbors = 0;
                for (int[] d : directions) {
                    int r = i + d[0], c = j + d[1];
                    if (r >= 0 && r < m && c >= 0 && c < n && (board[r][c] == 1 || board[r][c] == 2)) {
                        liveNeighbors++;
                    }
                }
                // Rules
                if (board[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[i][j] = 2; // live->dead (2 denotes cell was live but will die)
                }
                if (board[i][j] == 0 && liveNeighbors == 3) {
                    board[i][j] = 3; // dead->live (3 denotes cell was dead but will live)
                }
            }
        }

        // Final update: convert intermediate states to final states
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (board[i][j] == 2) board[i][j] = 0; // live to dead
                if (board[i][j] == 3) board[i][j] = 1; // dead to live
            }
        }
    }

    public static void main(String[] args) {
        GameOfLife obj = new GameOfLife();
        int[][] board = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };

        obj.gameOfLife(board);

        // Print the updated board
        for (int[] row : board) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }


}
