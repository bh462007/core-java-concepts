class Person{
    String name;

    public Person(String name) {
        this.name=name;
    }
    public void display(){
        System.out.println("Name: "+name);
    }
    

}
class Child extends Person{
    String hairs;

    public Child(String name, String hairs) {
        super(name);
        this.hairs = hairs;
    }
    public void display(){
        System.out.println("Hairs: "+hairs+" and Name: "+this.name);
    }
    public static void main(String[] args) {
        Person per=new Child("sam","brown");
        per.display();
    }

}
