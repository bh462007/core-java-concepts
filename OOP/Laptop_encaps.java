class Laptop_encaps{
    private String brand;
    private int ram;
    private double price;
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setRam(int ram){
        this.ram=ram;
    }
    public void setPrice(double  price){
        this.price=price;
    }
    public void showSpecs(){
        System.out.println("Brand: "+brand+"\nRAM: "+ram+" GB \nPrice: "+price);
    }
    public static void main(String[] args) {
        Laptop_encaps lap1=new Laptop_encaps();
        lap1.setBrand("HP");
        lap1.setPrice(65000);
        lap1.setRam(6);
        lap1.showSpecs();
    }
}