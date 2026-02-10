
import java.util.Scanner;

class Attendence_encaps{
    private String studentName;
    private int totalDays;
    private int presentDays;

    public void markPresent(){
        presentDays++;
    }
    public double getAttendencePercentage(){
        if(totalDays == 0){
            return 0;
        }
        return (presentDays*100.0)/totalDays;
    }
    public void printReport(){
        System.out.println("Student name: "+studentName+"\nTotal days: "+totalDays+"\nPresent days: "+presentDays);
    }
    
    public static void main(String[] args) {
        Attendence_encaps atd1=new Attendence_encaps();
        atd1.studentName="sam";
        Scanner sc=new Scanner(System.in);
        System.out.println("Does class happen today (yes/no)");
        String ch=sc.next();
        if(ch.equals("yes")){

            atd1.totalDays++;
            System.out.println("Does student came (yes/no)");
            String present=sc.next();

            if(ch.equals(present)){
                atd1.markPresent();
            }
        }
        atd1.printReport();
        
    }
}