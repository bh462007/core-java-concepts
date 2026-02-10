
class Quiz_encaps{
    private final int totalQuestions;
    private int correctAnswers;
    public Quiz_encaps(int totalQuestions){
        this.totalQuestions=totalQuestions;
        this.correctAnswers=0;
    }
    public void submitAnswers(){
        if(this.correctAnswers < this.totalQuestions){
            correctAnswers++;
        }
    }
    public double getScorePercentage(){
        double per=((double) correctAnswers/totalQuestions)*100;
        return per;
    }
    public void printResult(){
        double result=getScorePercentage();
        System.out.println("Score: "+result+"%");

        if(result > 70){
            System.out.println("Excellent");
        }
        else if(result < 70 && result > 50){
            System.out.println("Good");
        }
        else{
            System.out.println("Try again...");
        }
    }
    public static void main(String[] args) {
        Quiz_encaps qe1=new Quiz_encaps(10);
        qe1.submitAnswers();
        qe1.submitAnswers();
        qe1.submitAnswers();
        qe1.submitAnswers();
        qe1.submitAnswers();
        qe1.submitAnswers();
        qe1.printResult();
    }
}