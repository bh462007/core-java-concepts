class Vehicle{
    String brand;
    public Vehicle(String brand) {
        this.brand=brand;
        System.out.println("Brand: "+brand);
    }
    

}
class Car extends Vehicle{
    int speed;
    public Car(String brand, int speed) {
        super(brand);
        this.speed=speed;
        System.out.println("Speed: "+speed+" and Brand: "+this.brand);
    }
    
    public static void main(String[] args) {
        Car c1=new Car("SUV", 90);
        
    }
}