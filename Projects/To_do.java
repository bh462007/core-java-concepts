
import java.util.ArrayList;
import java.util.Scanner;

class Task{
    protected int id;
    protected String name;
    protected boolean isCompleted;

    public Task(int id, String name) {
        this.id = id;
        this.name = name;
        this.isCompleted = false;
    }
    
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public boolean getIscompleted(){
        return isCompleted;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setIscompleted(boolean isCompleted){
        this.isCompleted=isCompleted;
    }
}
class To_do{
    static ArrayList<Task> task=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    static int counter=0;
    public static void main(String[] args) {
        boolean running=true;
        while(running){
            System.out.println("*****To-do list");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark taask as completed");
            System.out.println("4. Display all tasks");
            System.out.println("5. Exit");
            System.out.println("Enter your choise: ");
            int choice=sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: Addtask(); break;
                case 2: Removetask(); break;
                case 3: Markcompleted(); break;
                case 4: Displaytasks(); break;
                case 5: running=false;
                        System.out.println("Exiting system...");
                        break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    public static void Addtask(){
        System.out.println("Enter task name: ");
        String name=sc.next();
        int id=counter+1;
        task.add(new Task(id,name));
        System.out.println("Task successfully added");

    }
    public static void Removetask(){
        System.out.println("Enter task id to remove: ");
        int id=sc.nextInt();
        boolean flag=false;
        for (int i = 0; i < task.size(); i++) {
            if(task.get(i).getId() == id){
                task.remove(i);
                flag=true;
                System.out.println("Task successfully removed");
            }
        }
        if(!flag){
            System.out.println("Task not found");
        }
    }
    public static void Markcompleted(){
        System.out.println("Enter task id to mark it completed: ");
        int id=sc.nextInt();
        boolean flag=false;
        for(Task t : task){
            if(t.getId()==id){
                t.setIscompleted(true);
                flag=true;
                System.out.println("Successfully marked it true");
                break;
            }
        }
        if(!flag){
            System.out.println("Could not found task");
        }
    }
    public static void Displaytasks(){
        if(task.isEmpty()){
            System.out.println("No task available");
        }
        else{
            for(Task t:task){
                System.out.println("ID:"+t.getId()+" Name: "+t.getName()+" Is-completed? "+t.getIscompleted());
            }
        }
    }
}