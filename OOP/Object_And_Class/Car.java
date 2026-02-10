class Car{
    String brand;
    int speed;
    public void showDetails(){
        System.out.println("Brand: "+brand+" mph");
        System.out.println("Speed: "+speed);
    }
    public static void main(String[] args) {
        Car c1=new Car();
        Car c2=new Car();
        
        c1.brand="bugatti";
        c1.speed=70;

        c2.brand="SUV";
        c2.speed=60;

        c1.showDetails();
        c2.showDetails();
    }
}