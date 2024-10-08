public class W12_P4 {

    public void printBoard(int[][] board){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j]);
            }
            if(i != 8) System.out.println();
        }
    }

    public boolean checkValue(int[][] board, int row, int col, int value){
        for (int i = 0; i< 9 ; i++){
            if ( board[row][i] == value ) return false;
            if (board[i][col] == value) return false;
        }
        row = (row/3)*3 ;
        col = (col/3)*3 ;
        for ( int i = 0; i< 3; i++){
            for (int j = 0; j< 3; j++){
                if (board[row+i][col+j] == value) return false;
            }
        }

        return true;
    }

    public boolean backtrack(int [][] board, int pos){

        if (pos > 80) return true;

        int row = pos/9;
        int col = pos%9;

        if (board[row][col] != 0) return backtrack(board, pos+1);

        for (int i = 1; i <= 9; i++) {
            if (checkValue(board, row, col, i)){
                board[row][col] = i;
                if (backtrack(board, pos+1)) return true;
                board[row][col] = 0;
            }
        }

        return false;
    }

    public boolean solveSudoku(int [][] board){
        return backtrack(board, 0);
    }

    public static void main(String[] args) {
        W12_P4 solver = new W12_P4();
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        System.out.println("Sudoku board before solving:");
        solver.printBoard(board);

        if (solver.solveSudoku(board)) {
            System.out.println("\nSudoku board after solving:");
            solver.printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
