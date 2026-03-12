package Tasks;

public class classdemo {
    public static void main(String[] args)
    {
       animal a =  new animal();
       a.age = 10;
       a.colour = "black";
       a.dog();

    }

    static class animal {
       int age;
       String colour;

       void dog()
       {
           System.out.println("the age of dog is"+age+"the colour of dog is "+colour);
       }

    }
}
