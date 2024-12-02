package counter;

import java.util.ArrayList;
import java.util.List;

public class Meaningfulname {
    public static final int STATUS_VALUE = 0;
    public static final int FLAGGED = 4;
    private List<int[]> gameBoard; 

    public Meaningfulname() {
        gameBoard = new ArrayList<>();
        gameBoard.add(new int[]{4, 1}); 
        gameBoard.add(new int[]{0, 2});
        gameBoard.add(new int[]{4, 3});
    }

    public List<int[]> getFlaggedCells() {
        List<int[]> flaggedCells = new ArrayList<>();
        for (int[] cell : gameBoard) {
            if (cell.length > STATUS_VALUE && cell[STATUS_VALUE] == FLAGGED) {
                flaggedCells.add(cell);
            }
        }
        return flaggedCells;
    }

    public static void main(String[] args) {
        Meaningfulname game = new Meaningfulname();
        List<int[]> flaggedCells = game.getFlaggedCells();

        System.out.println("Flagged Cells:");
        for (int[] cell : flaggedCells) {
            System.out.print("Cell: ");
            for (int value : cell) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
