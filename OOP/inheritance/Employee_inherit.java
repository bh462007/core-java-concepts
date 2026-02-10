
class Person{
    String name;
    int age;
    void showPerson(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

}
class Employee_inherit extends Person{
    int employeeID;
    double salary;
    void showEmployee(){
        System.out.println("Employee id: "+employeeID);
        System.out.println("Salary: "+salary);
    }
    public static void main(String[] args) {
        Employee_inherit emp=new Employee_inherit();
        emp.name="sam";
        emp.age=20;
        emp.employeeID=225145;
        emp.salary=75000;
        
        emp.showPerson();
        emp.showEmployee();
    }
}