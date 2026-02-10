class Employee{
    int id;
    String name;
    int salary;

    public void printEmployee(){
        System.out.println("This is "+id+", "+name+" from IT department");
        System.out.println("Salary is "+salary+" LPA");
    }
    public static void main(String[] args) {
        Employee emp=new Employee();

        emp.id=101;
        emp.name="Sam";
        emp.salary=60000;

        emp.printEmployee();
    }
}