package task2;

public class Task2 {

     public static void main(String[] args) {
      int maxValue = 500;

        System.out.printf("%-6s %-6s %-10s%n", "Side 1", "Side 2", "Hypotenuse");

        for (int side1 = 1; side1 <= maxValue; side1++) {
            for (int side2 = side1; side2 <= maxValue; side2++) {
                for (int hypotenuse = side2; hypotenuse <= maxValue; hypotenuse++) {

                    if (side1 * side1 + side2 * side2 == hypotenuse * hypotenuse) {

                        System.out.printf("%-6d %-6d %-10d%n", side1, side2, hypotenuse);
                    }
                }
            }
        }
    }
}