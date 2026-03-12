package Javapractice;

import java.util.Scanner;

public class takeinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");

        String s = sc.nextLine();
        System.out.println(s);

        int a = sc.nextInt();
        System.out.println(a);

        float b = sc.nextFloat();
        System.out.println(b);

        double c = sc.nextDouble();
        System.out.println(c);

  }
}
