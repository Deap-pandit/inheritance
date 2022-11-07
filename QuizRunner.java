package Exercise10_1;
import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {

        String grade;
        int score;

        Quiz[] quiz = new Quiz[3] ;
        quiz[0] = new Quiz(26,"A+");
        quiz[1] = new Quiz(6,"B+");
        quiz[2] = new Quiz(2,"C");


        System.out.printf("%s  %.2f\n" ,"Average score is ", Data.avarage(quiz));


        Measurable meas = (Data.max(quiz));
        Quiz q = (Quiz) meas;
        System.out.println("Highest score  and Grade :  "  +q.getMeasure()+ "   " +q.getGrade());



    }
}
