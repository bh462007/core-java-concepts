
class Collage{
    static String collagename="MET IOE";
    String name;
    int rollno;

    void showStudentInfo(String name, int rollno){
        System.out.println("Collage name: "+collagename);
        System.out.println("Student name: "+name);
        System.out.println("Roll number: "+rollno);
        System.out.println();
    }

    public static void main(String[] args) {
        Collage c1= new Collage();
        c1.showStudentInfo("Sam Pawar", 45);

        Collage c2= new Collage();
        c2.showStudentInfo("Raj Sahani", 23);
        
    }
}