package Exercise10_1;


    public class Quiz implements Measurable{
        private  int score ;
        private String  grade ;


        public Quiz(int score,String grade) {
            this.score = score;
            this.grade = grade;
        }

        @Override
        public double getMeasure() {
            return score;
        }

        public String getGrade() {
            return grade;
        }
    }


