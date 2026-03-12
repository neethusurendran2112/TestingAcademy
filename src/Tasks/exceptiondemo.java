package Tasks;

public class exceptiondemo {
    public static void main(String[] args) {
        System.out.println("Started");
        String s = args[0];
        try{
            int a = Integer.parseInt(s);
            int b = a/0;
            System.out.println(b);
      }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
         System.out.println("The operation cannot be performed");
        }

        System.out.println("End");

    }
}
