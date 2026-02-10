class Device{
    String brand;
    boolean powerStatus;
    void turnOn(){
        powerStatus=true;
        System.out.println("Pwer turned on");
    }
}
class Mobile_inherit extends Device{
    int batteryLevel;
    void showMobile(){
        System.out.println("Brand: "+brand);
        System.out.println("Battery level: "+batteryLevel);
    }

    public static void main(String[] args) {
        Mobile_inherit mob = new Mobile_inherit();
        mob.brand="android";
        mob.powerStatus=false;
        mob.batteryLevel=85;

        mob.turnOn();
        mob.showMobile();
    }
}