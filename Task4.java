package task4;

public class Task4 {

    public static void main(String[] args) {
        
        //For the pattern (a)
        for (int a = 1; a <= 10; a++) {
            for (int n = 1; n <= a; n++) {
                System.out.print("*");
            }   
            System.out.println();
        }
        System.out.println();
        
        //For the pattern (b)
        for (int b = 10; b >= 1; b--) {
            for (int n = 1; n <= b; n++) {
                System.out.print("*");
            }   
            System.out.println();
        }
        System.out.println();
        
        //For the pattern (c)
        for (int c = 1; c <= 10; c++) {
            for (int n = 1; n < c; n++) {
                System.out.print(" ");
            }
            for (int l = 10; l >= c; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        //For the pattern (d)
        for (int d = 10; d >= 1; d--) {
            for (int n = 1; n < d; n++) {
                System.out.print(" ");
            }
            for (int m = 10; m >= d; m--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();  
    }    
}
