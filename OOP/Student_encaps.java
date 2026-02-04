class Student_encaps{
    private int rollno;
    private String name;
    private int marks;

    public void setRollno(int rollno){
        this.rollno=rollno;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }

    public int getRollno(){
        return rollno;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
    public void printDetails(){
        System.out.println("Roll no: "+rollno+" Name: "+name+" Marks: "+marks);
    }

    public static void main(String[] args) {
        Student_encaps std1=new Student_encaps();
        std1.setMarks(89);
        std1.setName("Bhagyashri");
        std1.setRollno(225135);

        std1.printDetails();

        System.out.println("Name: "+std1.getName());
        System.out.println("Roll: "+std1.getRollno());
        System.out.println("Marks: "+std1.getMarks());


    }
}