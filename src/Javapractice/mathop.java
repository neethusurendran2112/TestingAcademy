package Javapractice;

import java.util.Scanner;


public class mathop {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        a = scanner.nextInt();
        b = scanner.nextInt();
        int sum = add(a, b);
        int difference = subt(a, b);
        System.out.println(sum);
        System.out.println(difference);
    }

    //int quo = quot(a,b);
//int prod = mult(a,b);
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int subt(int a, int b) {
        return a - b;
    }
}








