package task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        double totalRetailVal = 0.0;
        int productNum;
        int quantitySold;
        
        while (true) {
            System.out.print("Enter product number (1-5 or 0 to stop) : " );
            productNum = keyboard.nextInt();
            
            if (productNum == 0) {
                break;
            }
            
            System.out.print("Enter quantity sold: ");
            quantitySold = keyboard.nextInt();
            
            switch (productNum) {
                case 1:
                    totalRetailVal += quantitySold * 2.98;
                    break;
                case 2:
                    totalRetailVal += quantitySold * 4.50;
                    break;
                case 3:
                    totalRetailVal += quantitySold * 9.98;
                    break;
                case 4:
                    totalRetailVal += quantitySold * 4.49;
                    break;
                case 5:
                    totalRetailVal += quantitySold * 6.87;
                    break;
            }            
        }
        System.out.printf("Total retail value of all prodcts sold is: $%.2f%n", totalRetailVal);
    }    
}
