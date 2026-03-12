package Javapractice;

import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int val = checkprime(num);
        if (val==2) {
            System.out.println("prime");
        } else if(val!=2)
        {
            System.out.println(" Not prime");
        }

    }

    public static int checkprime(int num) {
        int factcount = 0;
        for (int i = 1; i <=num; i++) {
            if (num % i == 0) {
                factcount++;
            }
        }
        return factcount;
    }
}


