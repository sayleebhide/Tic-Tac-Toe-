/**
 * Created by sayleebhide on 9/24/16.
 */
public class Board {
    //public static final char xMark= 'x';
    //private static final char oMark='o';
    private static final char defaultMark='#';
    public static int numRows;
    public static int numColumns;
    public static char [][]cells;

public Board(int numRows, int numColumns){
    this.numRows= numRows;
    this.numColumns= numColumns;
    cells= new char[numRows][numColumns];
    initBoard();
}

public void initBoard() {
    for (int i=0;i<numRows;i++){
        for(int j=0;j<numColumns;j++){
            cells[i][j]= defaultMark;
        }
    }
}
// to print the board
public void printBoard(){
    for (int i=0;i<numRows;i++){

        for(int j=0;j<numColumns;j++){

            System.out.print(cells[i][j]);
            System.out.print("|");


        }
        System.out.println();


    }

}
    public void putMark(int askX, int askY, char ID) {
        cells[askX][askY] = ID;


    }

    public void showBoard() {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                System.out.print(cells[i][j]);
            }
            System.out.println();
        }

    }
    public boolean isValid(int askX, int askY) {
        if( askX>-1 && askY>-1&&askX<numRows&&askY<numColumns)
            return true;
        return false;
    }

    public boolean isOverlap(int x, int y){
        if(cells[x][y] == 'o' || cells[x][y] == 'x') {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWinner(){
        if(checkRow()||checkColumn()||checkDiagonal())
            return true;
     return false;
    }
    public boolean checkRow(){
        for(int i=0;i<3;i++){
            if(cells[i][0]==cells[i][1] && cells[i][1]==cells[i][2] &&(cells[i][0]=='x'||cells[i][0]=='o'))
                return true;
        }
        return false;
    }
    public boolean checkColumn(){
        for(int i=0;i<3;i++){
            if(cells[0][i]==cells[1][i] && cells[1][i]==cells[2][i]&&(cells[0][i]=='x'||cells[0][i]=='o'))
                return true;
        }
        return false;
    }
    public boolean checkDiagonal(){
        if(cells[0][0]==cells[1][1] && cells[1][1]==cells[2][2]&&(cells[0][0]=='x'||cells[0][0]=='o'))
            return true;
     return false;
    }


    public boolean isFull(){
        for(int i=0;i<numRows;i++){
            for(int j=0;j<numColumns;j++){
                if(cells[i][j]=='#') {
                    return false;
                }
            }
        }
       return true;
    }


}