package temp;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner mkey = new Scanner(System.in);
        System.out.println("Welcome to the world population calculator");
        System.out.print("Enter the current world population:");
        long worldPop = mkey.nextLong();
        System.out.print("Enter the current growth rate: (e.d, 1.14% would be .0114):");
        double growthRate = mkey.nextDouble();
        System.out.println("Year     Estimated Population     Change from prior Year");
        int countYear = 1;
        while (countYear < 76) {
            long newWorldPop = (long) (worldPop * growthRate) + worldPop;
            System.out.printf("%4d %24d %26d \n", countYear, newWorldPop, newWorldPop - worldPop);
            worldPop = newWorldPop;
            countYear++;
        }
    }
}
