class Car_encaps{
    private String brand;
    private int speed;
    private int fuel;

    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public void setFuel(int fuel){
        this.fuel=fuel;
    }
    public void showCarStatus(){
        System.out.println("Brand: "+brand+"\nSpeed: "+speed+"\nFuel: "+fuel);
    }
    public static void main(String[] args) {
        Car_encaps c1=new Car_encaps();
        c1.brand="suv";
        c1.speed=90;
        c1.fuel=50;

        c1.showCarStatus();
    }
}