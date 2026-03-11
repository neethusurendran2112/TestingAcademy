package Javapractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class primenum1ton {
    public static void main(String[] args) {
        int limit;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        limit = sc.nextInt();

        for (int i =2;i<=limit;i++)
        {
            boolean Isprime = true;
          for(int j = 2;j<=i/2;j++) {
              if (i % j == 0) {
                  Isprime = false;
                  break;
              }
          }
          if(Isprime == true)
              System.out.println(i);

          }
        }


    }

