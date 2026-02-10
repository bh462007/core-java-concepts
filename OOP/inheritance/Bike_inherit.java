class Vehicle{
    String brand;
    int speed;
    void showVehicle(){
        System.out.println("Here..this is the vehicle");
    }
}
class Bike_inherit extends Vehicle{
    int mileage;
    void showBike(){
        System.out.println("Brand: "+brand);
        System.out.println("Speed: "+speed);
        System.out.println("Mileage: "+mileage);
    }
    public static void main(String[] args) {
        Bike_inherit bike=new Bike_inherit();
        bike.brand="unicorn";
        bike.speed=80;
        bike.mileage=20;
        bike.showBike();
        bike.showVehicle();
    }
}