package Tasks.Paraconstructor;

public class paras {

    int model;
    String nm;

    paras(int model_year,String name) {
        this.model = model_year;
        this.nm = name;
    }
       void display()
        {
            System.out.println(model);
            System.out.println(nm);
        }
    }
