package ru.vanya.control;

public class Figure {

  private final char FIGURE;

  private final char DEFAULT_VALUE_FOR_CELL = ' ';

  public static final char FIGURE_O = 'O';

  public static final char FIGURE_X = 'X';

  public Figure(final char FIGURE) {

    if (FIGURE == FIGURE_O | FIGURE == FIGURE_X) {

      this.FIGURE = FIGURE;

    }

  }

  public Figure() {

    this.FIGURE = DEFAULT_VALUE_FOR_CELL;

  }

  public char getFigure() {

    return FIGURE;

  }

}
