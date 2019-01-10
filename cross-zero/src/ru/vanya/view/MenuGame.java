package ru.vanya.view;
import ru.vanya.players.Human;
import ru.vanya.view.board.Board;
import java.util.Scanner;

public class MenuGame {

    private final Scanner SCANNER = new Scanner(System.in);

    private final Board BOARD = new Board();

    private final Human HUMAN = new Human();

    private final int POINTER_TO_A_GAME_WITH_A_ROBOT = 1;

    public void showMenu() {

        System.out.println(POINTER_TO_A_GAME_WITH_A_ROBOT + " -  Робот");

        int choice = SCANNER.nextInt();

        switch (choice) {

            case POINTER_TO_A_GAME_WITH_A_ROBOT:

                BOARD.initCells();

                HUMAN.startGame();

                break;
        }
    }

}
