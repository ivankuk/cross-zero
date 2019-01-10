package ru.vanya.players;
import ru.vanya.view.board.Board;

public class Human {

    private final Board BOARD = new Board();

    private final int MIN_COORDINATE = 0;

    private final int MAX_COORDINATE = BOARD.AN_ARRAY_OF_CELLS.length - 1;

    private final char FIGURE = 'X';

    private boolean checkCoordinate(final int NEW_COORDINATE) {

        if (NEW_COORDINATE >= MIN_COORDINATE | NEW_COORDINATE <= MAX_COORDINATE) return true;

        return false;
    }

    private boolean move(final int COORDINATE_X, final int COORDINATE_Y) {

        if (checkCoordinate(COORDINATE_X) | checkCoordinate(COORDINATE_Y)) {

            if (BOARD.AN_ARRAY_OF_CELLS[COORDINATE_X][COORDINATE_Y] == BOARD.getDefaultValueForCell()) {

                BOARD.AN_ARRAY_OF_CELLS[COORDINATE_X][COORDINATE_Y] = FIGURE;

                return true;
            }
        }

        else {

            System.out.println(BOARD.ERROR);

            startGame();

        }

        return false;
    }

    public void startGame() {

        BOARD.showBoard();

        move(BOARD.getCoordinateX(), BOARD.getCoordinateY());

        BOARD.showBoard();
    }

}
