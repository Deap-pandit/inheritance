package Exercise10_1;

public class Data {


    public  static Measurable max(Measurable[] objects)
    {
        int i=0;
        double  value=0 ;
        int index =0;
        //System.out.println("Obj: " + objects.length);
        for( i=0;i<objects.length;i++)
        {
            if(objects[i].getMeasure()>value)
            {
                value = objects[i].getMeasure();
                 index = i;

            }
        }
        return objects[index];


    }
    public  static double avarage (Measurable[] objects)
    {
        double sum =0.0 ;
        for(Measurable obj : objects )
        {
            sum = sum+obj.getMeasure();


        }
        if(objects.length>0)
        {
            return sum/ objects.length;

        }
        else
        {
            return 0;

        }

    }
}

