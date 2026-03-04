package Javapractice;


import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your num");
        int num = sc.nextInt();
        if(num%2==0)
        {
            System.out.println("the number is even");
        }
        else
        {
            System.out.println("the number is Oodd");
        }

    }
}
