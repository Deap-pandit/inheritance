package Exercise10_1;

public class PersonDemo {

    public static void main(String[] args) {

        Measurable[] person = new Measurable[4];
        person[0] = new Person("Peter",6);
        person[1] = new Person("Norton",12);
        person[2] = new Person("Tocci",6);
        person[3] = new Person("Resnick",6);
        //System.out.printf("Average score is  %.2f \n" ,Data.avarage(person) );
        Measurable meas = Data.max(person);

        Person p = (Person) meas;

        System.out.printf("Average score is  %.2f \n" ,Data.avarage(person) );
        System.out.println("Tallest  person name : " + p.getName());

    }
}
