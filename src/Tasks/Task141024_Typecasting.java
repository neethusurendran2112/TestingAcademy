package Tasks;

public class Task141024_Typecasting {
    public static void main(String[] args) {

        //Type casting is the process of converting one data type in to another data type

        // there are 2 ways to typecasting
        // 1) Implict type casting --> JVM will do it automatically
        //2) Explict type casting --> User should do manually

        //There 2 types of typecasting

        // 1) WIDENING Casting ( Automatically ) --> Converting small data types in to larger data types
        // byte >> short >> char >> int >> long >> float >> double

        byte a = 124;
        int b = a;
        System.out.println(b); // implict casting

        byte c = 124 ;
        int d = (int)c ;
        System.out.println(d); // explict casting

        // 2) NARROWING Casting ( Manually ) --> Converting large data types in to smaller data types
        // double >> float >> long >> int >> char >> short >> byte

        float pie = 3.14f ;
//        int pie1 = pie ;
//        System.out.println(pie1); // implict casting is not possible in NARROW casting

        int pie1 = (int)pie ;
        System.out.println(pie1); // only Explict casting works in NARROW casting
        // but data leaked will be happend in the Explict NARROW casting
    }

}
