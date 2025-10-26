//Sudoku Game Solver

public class EightyFour {
    public boolean isSafe(char[][] board,int row,int column,int number){
        //row and column
        for(int i =0;i<board.length;i++){
            if(board[i][column] == (char)(number+'0')){
                return false;
            }
            if(board[row][i] ==(char)(number+'0')){
                return false;
            }
        }

        //grid
        int sr = (row/3) * 3;
        int sc = (column/3) * 3;
        for(int i=sr;i<sr+3;i++){
            for(int j =sc;j<sc+3;j++){
                if(board[i][j]== (char)(number+'0')){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean helper(char[][] board,int row,int column){
        if(row == board.length){
            return true;
        }
        int newRow = 0;
        int newCol = 0;
        if(column!= board.length - 1){
            newRow = row;
            newCol = column + 1;
        }else{
            newRow = row+1;
            newCol = 0;
        }
        if(board[row][column]!= '.'){
            if(helper(board, newRow, newCol)){
                return true;}
        }   else{
                for(int i =1;i<=9;i++){
                    if(isSafe(board,row,column,i)){
                        board[row][column] = (char)(i+'0');
                        if(helper(board, newRow, newCol)){
                            return true;
                        }else{
                            board[row][column] = '.';
                        }
                    }
                }
            }
        return false;
        
    }
    public void solveSudoku(char[][] board){
        helper(board, 0, 0);

    }
}
