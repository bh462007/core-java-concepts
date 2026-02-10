class Animal{
    String name;
    int age;
    void makeSound(){
        System.out.println("Make some noise...");
    }
}
class Dog_inherit extends Animal{
    String breed;
    void bark(){
        System.out.println("Name: "+name+"\nAge: "+age);
        System.out.println("Breed: "+breed);
        System.out.println("Wauuuuu..!!");
    }
    public static void main(String[] args) {
        Dog_inherit dog=new Dog_inherit();
        dog.name="Bam";
        dog.age=9;
        dog.breed="Dobermann";

        dog.bark();
        dog.makeSound();
    }
}