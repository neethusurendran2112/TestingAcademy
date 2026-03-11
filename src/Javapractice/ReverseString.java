package Javapractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String z = sc.nextLine();
        String rev = " ";

        int length = z.length();
        for (int i =length-1;i>=0;i--)
        {
            rev = rev + z.charAt(i);
        }
        System.out.println(rev);

    }
}
