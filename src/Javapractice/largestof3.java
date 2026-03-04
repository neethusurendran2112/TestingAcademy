package Javapractice;

import javax.swing.*;
import java.util.Scanner;

public class largestof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b) {
            if (b > c) {
                System.out.println("a is greater");
            } else if (b == c) {
                System.out.println("a is greater");
            } else if (b < c) {
                if (a == c) {
                    System.out.println("a and c are equal and greater than b");
                }
                if (a > c) {
                    System.out.println("A is greeater");
                }
                if (a < c) {
                    System.out.println("C is greater");
                }
            }
        }
        if(a<b)
        {
            if (b>c)
            {
                System.out.println("b is greater");
            }
            if(b==c)
            {
                System.out.println("b and c are equal and greater than a");
            }
            if(b<c)
            {
                System.out.println("c is greater");
            }
        }
if (a==b)
{
    if(b>c)
    {
        System.out.println("a and b are equal and larger than c");
    }
    if(b<c)
    {
        System.out.println("a and b are equal but c is larger");
    }
}
    }
}

