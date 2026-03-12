package Tasks;

public class Task111024Operators {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int f = 5;
        int e = 11;
        boolean c=true;
        boolean d=false;
        //unary operators
        System.out.println("minus" + ~a);//-11 (minus of total positive value which starts from 0)
        System.out.println("negation" + ~e);//9 (positive of total minus, positive starts from 0)
        System.out.println(!c);//false (opposite of boolean value)
        System.out.println(!d);//true
        System.out.println(a++); //post increment
        System.out.println(++a); //pre increment
        System.out.println(a--);//post decrement
        System.out.println(--a);// pre decrement
int sum = a+b;
int diff = a-b;
int Product = a*b;
int quotient = a/b;
int modulus = a%b;
        //Arithmetic Operators
        System.out.println("sum " + sum);
        System.out.println("diff " + diff);//
        System.out.println("product "+ Product);//
        System.out.println("Quotient "+ quotient);//
        System.out.println("Modulus " + modulus);//

        //Assigment Operator
        a+=4;//a=a+4 (a=10+4)
        b-=4;//b=b-4 (b=20-4)
        System.out.println(a);
        System.out.println(b);
        a*=2;//
        System.out.println(a);
        a/=2;//
        System.out.println(a);
        //Ternary
        int min=(a<b)?a:b;
        System.out.println(min);

        //Leftshift Operator
        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(10<<3);//10*2^3=10*8=80
        System.out.println(20<<2);//20*2^2=20*4=80
        System.out.println(15<<4);//15*2^4=15*16=240

        //Right Shift Operator
        System.out.println(10>>2);//10/2^2=10/4=2
        System.out.println(20>>2);//20/2^2=20/4=5
        System.out.println(20>>3);//20/2^3=20/8=2

        //For positive number, >> and >>> works same
        System.out.println(20>>2);
        System.out.println(20>>>2);
        //For negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20>>2);
        System.out.println(-20>>>2);
//And Operator
        System.out.println(a<b&&a<f);//false && true = false
        System.out.println(a<b&a<f);//false & true = false

        //Or operator
        System.out.println(a>b||a<f);//true || true = true
        System.out.println(a>b|a<f);//true | true = true

    }
}
