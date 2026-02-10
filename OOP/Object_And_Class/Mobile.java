class Mobile{
    String brand;
    int price;
    void showInfo(){
        System.out.println("Brand: "+brand+" and price is "+price);
    }
    public static void main(String[] args) {
        Mobile mob1=new Mobile();
        Mobile mob2=new Mobile();

        mob1.brand="samsung";
        mob1.price=23000;

        mob2.brand="vivo";
        mob2.price=19000;

        mob1.showInfo();
        mob2.showInfo();
    }
}