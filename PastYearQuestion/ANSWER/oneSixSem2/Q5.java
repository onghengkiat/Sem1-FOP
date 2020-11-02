import java.util.Random;

class Q5{
    public static void main(String[] args) {
        Random rnd = new Random();
        int [][] board = new int [3][3];
        int turn = 0 ;
        for(int row = 0 ; row < board.length ; row ++){
            for(int column = 0 ; column < board[row].length ; column++){
                //assume 2 as havent fill in
                board [row][column] = 2;
            }
        }

        int row = rnd.nextInt(3);
        int column = rnd.nextInt(3);

        while(turn < 9 ){
            turn ++;
            while(board[row][column] != 2){
                row = rnd.nextInt(3);
                column = rnd.nextInt(3);
            }
            board[row][column] = turn%2;
        }

        displayBoard(board);
        checkRow(board);
        checkColumn(board);
        checkDiagonal(board);
    }

    public static void checkRow(int [][] board ){
        for(int row = 0 ; row < board.length ; row ++){
            boolean same = true;
            for(int column = 1 ; column < board[row].length ; column ++){
                if(board[row][column] != board[row][column - 1]){
                    same = false ;
                }
            }
            if(same)
                System.out.println("All " + board[row][0] + "s on row " + (row+1) );
        }
    }

    public static void checkColumn(int [][] board){
        for(int column = 0 ; column < board.length ; column ++){
            boolean same = true;
            for(int row = 1 ; row < board.length ; row ++){
                if(board[row][column] != board[row-1][column]){
                    same = false;
                }
            }
            if(same)
                System.out.println("All " + board[0][column] + "s on column " + (column+1) );
        }

    }

    public static void checkDiagonal(int [][] board){
        boolean same = true;
        for(int row = 1 ; row < board.length ; row++){
            if(board[row][row] != board[row-1][row-1]){
                same = false;
            }
        }
        if(same){
            System.out.println("All " + board[0][0] + "s on diagonal leftTop to rightBottom");
        }

        same = true;
        for(int row = 1 ; row < board.length ; row++){
            if(board[row][board.length - row - 1] != board[row-1][board.length - (row - 1) - 1]){
                same = false;
            }
        }
        if(same){
            System.out.println("All " + board[board.length - 1][0] + "s on diagonal leftBottom to rightTop");
        }
    }

    public static void displayBoard(int [][] board){
        for(int [] row : board){
            for(int column : row){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
