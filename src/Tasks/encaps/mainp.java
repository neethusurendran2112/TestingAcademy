package Tasks.encaps;

public class mainp {
    public static void main(String[] args)
    {
        Person p = new Person("neethu","7907764088");
        System.out.println(p.getName());
        System.out.println(p.getPhone_number());
    }
}



class Person
{
    private String name;
    private String phone_number;

  public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Person(String nm, String phone)
    {
        this.name = nm;
        this.phone_number= phone;
    }
}

