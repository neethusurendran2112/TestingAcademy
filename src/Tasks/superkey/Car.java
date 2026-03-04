package Tasks.superkey;

public class Car extends Vehicle{

    private int maxspeed = 200;
    void display()
    {
        System.out.println("the max speed of child is "+super.maxspeed);
    }
    Car()
    {
        System.out.println("Child dc is called");
    }

}
