import java.util.Scanner;

/**
 * Created by sayleebhide on 9/24/16.
 */
public class Player {
    private  char ID;
    private  String name;
    private  Board board;
    private Scanner scanner = new Scanner(System.in);

    public Player(char ID, String name, Board _board) {
        this.ID = ID;
        this.name = name;
        board = _board;
    }

    public void Playwith(Player other) {
        while (true) {

            while (true) {
                if(board.isWinner()) {
                    System.out.println("Winner is player " + other.name);
                    return;
                }
                if(board.isFull()) {
                    System.out.println("Board is full");
                    return;
                }
                System.out.println("Player " + name + " Please enter position x and y");
                int askX = scanner.nextInt();
                int askY = scanner.nextInt();
                if (!board.isValid(askX, askY)) {
                    System.out.println("Please enter your values again");
                    continue;
                }
                if (board.isOverlap(askX, askY)) {
                    System.out.println("Overlap!");
                    continue;
                } else {
                    board.putMark(askX, askY, ID);
                    board.showBoard();
                    break;
                }

            }

            while (true) {
                if(board.isWinner()) {
                    System.out.println("Winner is player " + name);
                    return;
                }
                if(board.isFull()) {
                    System.out.println("Board is full");
                    return;
                }

                System.out.println("Player " + other.name + "Please enter position x and y");
                int askX = scanner.nextInt();
                int askY = scanner.nextInt();
                if (!board.isValid(askX, askY)) {
                    System.out.println("Please enter your values again");
                    continue;
                }
                if (board.isOverlap(askX, askY)) {
                    System.out.println("Overlap!");
                    continue;
                } else {
                    board.putMark(askX, askY, other.ID);
                    board.showBoard();
                    break;
                }


            }
        }
    }

}
