package ru.vanya.control;
import ru.vanya.view.board.Board;

public class ControllerGame {

  private final Board BOARD = new Board();

  private final int MIN_COORDINATE = 0;

  private final int MAX_COORDINATE = BOARD.AN_ARRAY_OF_CELLS.length;

  public boolean checkCoordinate(final int COORDINATE) {

    if (COORDINATE >= MIN_COORDINATE & COORDINATE <= MAX_COORDINATE) return true;

    return false;

  }

  public boolean cellCheck(final int COORDINATE_X, final int COORDINATE_Y) {

    if (BOARD.AN_ARRAY_OF_CELLS[COORDINATE_X][COORDINATE_Y] == BOARD.getDefaultValueForCell()) return true;

    return false;

  }

  public boolean checkWin(final Figure FIGURE) {

    for (int w = MIN_COORDINATE; w <= MAX_COORDINATE; w++) {

      if (BOARD.AN_ARRAY_OF_CELLS[w][0] == FIGURE | BOARD.AN_ARRAY_OF_CELLS[0][w] == FIGURE | BOARD.AN_ARRAY_OF_CELLS[w][1] == FIGURE | BOARD.AN_ARRAY_OF_CELLS[1][w] == FIGURE | BOARD.AN_ARRAY_OF_CELLS[w][2] == FIGURE | BOARD.AN_ARRAY_OF_CELLS[2][w] == FIGURE) {

        BOARD.showWin(FIGURE);

        return true;

      }

    }

    if (BOARD.AN_ARRAY_OF_CELLS[0][0] == FIGURE & BOARD.AN_ARRAY_OF_CELLS[1][1] == FIGURE & BOARD.AN_ARRAY_OF_CELLS[2][2] == FIGURE) {

      BOARD.showWin(FIGURE);

      return true;

    }

    if (BOARD.AN_ARRAY_OF_CELLS[0][2] == FIGURE & BOARD.AN_ARRAY_OF_CELLS[1][1] == FIGURE & BOARD.AN_ARRAY_OF_CELLS[2][0] == FIGURE) {

      BOARD.showWin(FIGURE);

      return true;

    }

    return false;

  }

  public boolean checkDraw() {

    for (int d = MIN_COORDINATE; d <= MAX_COORDINATE; d++) {

      for (int r = MIN_COORDINATE; r <= MAX_COORDINATE; r++) {

        if (BOARD.AN_ARRAY_OF_CELLS[d][r] != BOARD.getDefaultValueForCell()) {

          BOARD.showDraw();

          return true;

        }

      }

    }

    return false;

  }

}
