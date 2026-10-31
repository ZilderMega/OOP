package enums;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int selectShape = scanner.nextInt();

        switch (selectShape) {
            case 1 -> {
                EquilateralShape shape = EquilateralShape.SQUARE;
                shape.drawShape(len);
            }

            case 2 -> {
                EquilateralShape shape = EquilateralShape.EQUILATERALTRIANGLE;
                shape.drawShape(len);
            }

            default -> {
                System.out.println("Нет такой фигуры");
            }
        }
    }
}
