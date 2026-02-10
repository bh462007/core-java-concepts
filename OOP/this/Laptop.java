class Laptop{
    String brand;
    int ram;
    int price;

    public Laptop(String brand, int ram, int price){
        this.brand=brand;
        this.ram=ram;
        this.price=price;
    }
    void showSpecs(){
        System.out.println("Brand :"+this.brand);
        System.out.println("RAM :"+this.ram);
        System.out.println("Price :"+this.price);
    }
    public static void main(String[] args) {
        Laptop l1=new Laptop("HP",6,54000);
        l1.showSpecs();
    }
}