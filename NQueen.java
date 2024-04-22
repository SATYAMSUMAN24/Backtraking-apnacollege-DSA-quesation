public class NQueen {
    public static void NQueen(char board[][], int row){
        //base
        if(row == board.length) {
            printBoard(board);
            return;
        }
        // column loop
        for(int j = 0; j<board.length; j++){
            board[row][j] = '0';
            NQueen(board, row+1);
            board[row][j] = '.';
        }
    }
    public static void printBoard(char board[][]) {
        System.out.println(".......chessBoard........");
        for(int i = 0; i<board.length; i++) {
            for(int j = 0; j<board.length; j++);
            System.out.print(board[i][i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];

        // initialized
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++) {
                board[i][j] = '.';
            }
        }
        NQueen(board, 0);
    }
}
