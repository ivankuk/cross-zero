package ru.vanya.players;
import ru.vanya.view.board.Board;
import ru.vanya.control.*;

public class Human {

    private static final Board BOARD = new Board();

    private static final char FIGURE = new Figure('O');

    private static final ControllerGame CONTROLLER_GAME = new ControllerGame();

    private static boolean move(final int COORDINATE_X, final int COORDINATE_Y) {

        if (CONTROLLER_GAME.checkCoordinate(COORDINATE_X) | CONTROLLER_GAME.checkCoordinate(COORDINATE_Y)) {

            if (CONTROLLER_GAME.cellCheck(COORDINATE_X, COORDINATE_Y)) {

                while (true) {

                  BOARD.setFigure(COORDINATE_X, COORDINATE_Y, FIGURE);

                  return true;

                }
            }
        }

        else {

            System.out.println(BOARD.ERROR);

            startGame();

        }

        return false;
    }

    public static void startGame() {

        BOARD.showBoard();

        move(BOARD.getCoordinateX(), BOARD.getCoordinateY());

        if (!CONTROLLER_GAME.checkWin(FIGURE)) {

          if (!CONTROLLER_GAME.checkDraw()) {

            Bot.startBotGame();

          }

        }
    }

}
