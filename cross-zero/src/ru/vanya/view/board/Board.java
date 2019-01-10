package ru.vanya.view.board;
import java.util.Scanner;

public class Board {

  private final Scanner SCANNER = new Scanner(System.in);

  private final int MIN_SIZE = 0;

  private final int MAX_SIZE = 3;

  private final char DEFAULT_VALUE_FOR_CELL = '*';

  public final char[][] AN_ARRAY_OF_CELLS = new char[MAX_SIZE][MAX_SIZE];

  public final String ERROR =  "Такая клетка не доступна для для хода. Поторите попытку";

  public void initCells() {

    for (int i = MIN_SIZE; i < MAX_SIZE; i++) {

      for (int g = MIN_SIZE; g < MAX_SIZE; g++) {

        AN_ARRAY_OF_CELLS[i][g] = DEFAULT_VALUE_FOR_CELL;

      }

    }

  }

  public void showBoard() {

    for (int x = MIN_SIZE; x < MAX_SIZE; x++) {

      System.out.println();

      for (int y = MIN_SIZE; y < MAX_SIZE; y++) {

          System.out.print("[ " + AN_ARRAY_OF_CELLS[x][y] + " ]");

      }

    }

  }

  public int getCoordinateX() {

    System.out.println();

    System.out.println("Введите координату X");

    System.out.print(">");

    int coordinateX = SCANNER.nextInt() - 1;

    return coordinateX;

  }

  public int getCoordinateY() {

      System.out.println();

      System.out.println("Введите координату Y");

      System.out.print(">");

      int coordinateY = SCANNER.nextInt() - 1;

      return coordinateY;

  }

  public char getDefaultValueForCell() {

    return DEFAULT_VALUE_FOR_CELL;

  }
}
