class Employee2{
    int id;
    String name;
    double salary;

    public Employee2(int i, String n, double s) {
        id=i;
        name=n;
        salary=s;
        
    }
    public void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
    

    public static void main(String[] args) {
        Employee2 emp=new Employee2(101, "John", 50000.0);
        emp.display();
    }
}