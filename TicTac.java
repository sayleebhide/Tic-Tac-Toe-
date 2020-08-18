/**
 * Created by sayleebhide on 9/24/16.
 */
public class TicTac {
        private static final int numRows = 3;
        private static final int numColumns = 3;

        public static void main(String[] args) {
            System.out.println("Game Start!");
            Board board = new Board(numRows, numColumns);
            board.printBoard();
            Player player1 = new Player('o', "James", board);
            Player player2 = new Player('x', "Chris", board);
            player1.Playwith(player2);
        }
    }

