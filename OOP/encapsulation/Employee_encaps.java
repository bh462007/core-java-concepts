class Employee_encaps{
    private int id;
    private String name;
    private double salary;

    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public int getId(){
        return id;
    }
    public String name(){
        return name;
    }
    public double salary(){
        return salary;
    }
    public void displayEmployee(){
        System.out.println("ID: "+id+" Name: "+name+" Salary: "+salary);
    }

    public static void main(String[] args) {
        Employee_encaps emp1=new Employee_encaps();
        emp1.setId(35);
        emp1.setName("Bhagyashri");
        emp1.setSalary(99000);

        emp1.displayEmployee();

        System.out.println("ID: "+emp1.id+"\nName: "+emp1.name+"\nSalary: "+emp1.salary);
    }
}