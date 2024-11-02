package Oct.exe_09102024;
import java.util.Scanner;

public class Tableprintf {
    public static void main(String[] args)  
    {
        int num;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the number");
        num  = myObj.nextInt();  // Read user input
        System.out.printf("%d x %d = %d", num , 1 , num*1);
        System.out.println();
        System.out.printf("%d x %d = %d", num , 2 , num*2);
        System.out.println();
        System.out.printf("%d x %d = %d", num , 3 , num*3);
        System.out.println();
        System.out.printf("%d x %d = %d", num , 4 , num*4);
        System.out.println();
        System.out.printf("%d x %d = %d", num , 5 , num*5);
        System.out.println();
        System.out.printf("%d x %d = %d", num , 6 , num*6);
        System.out.println();
        System.out.printf("%d x %d = %d", num , 7 , num*7);
        System.out.println();
        System.out.printf("%d x %d = %d", num , 8 , num*8);
        System.out.println();
        System.out.printf("%d x %d = %d", num , 9 , num*9);
        System.out.println();
        System.out.printf("%d x %d = %d", num , 10 , num*10);
        System.out.println();
    }
}
