package Exercise10_1;

public class Person implements Measurable{

    String  name ;
    double height ;

    @Override
    public double getMeasure() {
        return height;
    }

    public Person(String name,double height) {

        this.name = name;
        this.height = height ;
    }

    public String getName()
    {
        return name;

    }
}
