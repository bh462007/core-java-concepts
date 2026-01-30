class Student2{
    int rollno;
    String name;

    public Student2() {
        rollno=78;
        name="Shree";
    }

    public Student2(int r, String n) {
       rollno=r;
       name=n;
    }
    void display(){
        System.out.println("Roll no: "+rollno);
        System.out.println("Name: "+name);
    }
    
    public static void main(String[] args) {
        Student2 std1=new Student2();
        Student2 std2=new Student2(82,"Bhagyashree");

        std1.display();
        std2.display();

    }
}