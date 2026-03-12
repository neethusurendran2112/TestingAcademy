package Javapractice;
import java.util.Scanner;
public class chattgpt {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter 3 numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a >= b && a >= c) {
                if (a == b && a == c) {
                    System.out.println("All numbers are equal");
                } else if (a == b) {
                    System.out.println("a and b are equal and greatest");
                } else if (a == c) {
                    System.out.println("a and c are equal and greatest");
                } else {
                    System.out.println("a is greatest");
                }
            }
            else if (b >= a && b >= c) {
                if (b == c) {
                    System.out.println("b and c are equal and greatest");
                } else {
                    System.out.println("b is greatest");
                }
            }
            else {
                System.out.println("c is greatest");
            }

            sc.close();
        }
}

