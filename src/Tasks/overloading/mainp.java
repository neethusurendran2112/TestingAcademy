package Tasks.overloading;

public class mainp {
    int a;
    int b;
    String c;

    mainp(int x,int y)
    {
     this.a = x;
     this.b=y;
     System.out.println(this.a);
     System.out.println(this.b);

    }
    mainp(int x, int y, String z)
    {
        this.a = x;
        this.b=y;
        this.c=z;
        System.out.println("pc1");
    }


}
