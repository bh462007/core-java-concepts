
import java.util.ArrayList;
import java.util.Scanner;

class Student{
    protected int id;
    protected String name;
    protected double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getMarks(){
        return  marks;
    }
    
    public void setName(String name){
        this.name=name;
    }
    public void setMarks(double marks){
        this.marks=marks;
    }
    public void display(){
        System.out.println("ID: "+id+" Name: "+name+" Marks: "+marks);
    }
}

class StdManagement{
    public static ArrayList<Student> std=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        boolean running=true;
        while(running){
            System.out.println("*****Student Management System*****");
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Search student");
            System.out.println("4. Display all students");
            System.out.println("5. Exit");
            System.out.println("Choose an option...");
            int choice=sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1: addStudent(); break;
                case 2: removeStudent(); break;
                case 3: searchStudent(); break;
                case 4: displayStudent(); break;
                case 5: running=false;
                        System.out.println("Exiting system...");
                        break;
                default: System.out.println("Invalid option...\n try again");
            }
        }
    }

    public static void addStudent(){
        System.out.println("Enter the ID: ");
        int id=sc.nextInt();
        System.out.println("Enter the name: ");
        String name=sc.next();
        System.out.println("Enter the marks: ");
        double marks=sc.nextDouble();
        std.add(new Student(id, name, marks));
        System.out.println("Student added successfully");
    }
    public static  void removeStudent(){
        System.out.println("Enter the ID: ");
        int id=sc.nextInt();
        boolean flag=false;
        for (int i = 0; i < std.size(); i++) {
            if(std.get(i).getId() == id){
                std.remove(i);
                flag =true;
                System.out.println("Student removed successfully");
                break;
            }
        }
        if(!flag){
            System.out.println("Invalid ID");
        }
    }
    public static void searchStudent(){
        System.out.println("Enter student ID: ");
        int id=sc.nextInt();
        for(Student s: std){
            if(s.getId()==id){
                System.out.println("Student found");
                s.display();
                return;
            }
        }
        System.out.println("Invalid ID");
    }
    public static void displayStudent(){
        if(std.isEmpty()){
            System.out.println("No students added yet...");
        }
        else{
            System.out.println("All students: ");
            for(Student s: std){
                s.display();
            }
        }
    }
}