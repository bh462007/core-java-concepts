class Person{
    String name;

    public Person(String name, String brown) {
        this.name=name;
        System.out.println("Name: "+name);
    }
}
class Student extends Person{
    double marks;

    public Student(String name, double marks) {
        super(name, "brown");
        this.marks=marks;
        System.out.println("Marks: "+marks+" and Name: "+this.name);
    }
    public static void main(String[] args) {
        Student std1=new Student("sam", 89);

    }
    
}