package ru.vanya.players;
import ru.vanya.control.ControllerGame;
import ru.vanya.view.board.Board;
import java.util.Random;

public class Bot {

  private static final Board BOARD = new Board();

  private static final Random RANDOM = new Random();

  private static final char FIGURE_BOT = 'O';

  private static final ControllerGame CONTROLLER_GAME = new ControllerGame();

  private static int getBotCoordinateX() {

    int botCoordinateX = RANDOM.nextInt();

    return botCoordinateX;

  }

  private static int getBotCoordinateY() {

    int botCoordinateY = RANDOM.nextInt();

    return botCoordinateY;

  }

  private static boolean moveRandom(final int RANDOM_COORDINATE_X, final int RANDOM_COORDINATE_Y) {

    if (CONTROLLER_GAME.checkCoordinate(RANDOM_COORDINATE_X) | CONTROLLER_GAME.checkCoordinate(RANDOM_COORDINATE_Y)) {

      if (CONTROLLER_GAME.cellCheck(RANDOM_COORDINATE_X, RANDOM_COORDINATE_Y)) {

        while (true) {

          BOARD.setFigure(RANDOM_COORDINATE_X, RANDOM_COORDINATE_Y, FIGURE_BOT);

          return true;
          
        }

      }

    }

    else {

      moveBot();

    }

    return false;

  }

  private static boolean moveBot() {

    if (moveRandom(getBotCoordinateX(), getBotCoordinateY())) return true;

    return false;

  }

  public static void startBotGame() {

    moveBot();

    if (!CONTROLLER_GAME.checkWin(FIGURE_BOT)) {

      if (!CONTROLLER_GAME.checkDraw()) {

        Human.startGame();

      }

    }
  }

}
