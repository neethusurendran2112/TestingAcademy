package Javapractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class powerprogram {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double  a, b;
        System.out.println("Emter the numbers");
        a = sc.nextDouble();
        b= sc.nextDouble();
        int x =  (int)a;
        int y = (int)b;
        int res = power(x,y);
        System.out.println(res);


    }
    public static int power(int a,int b)
    {
        int res = (int) Math.pow(a,b);
        return res;
    }
}
