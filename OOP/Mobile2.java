class Mobile2{
    String brand;
    int price;

    public Mobile2(String b, int p) {
        brand=b;
        price=p;
    }
    void showMobile(){
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
    }
    
    public static void main(String[] args) {
        Mobile2 mob=new Mobile2("realme",16000);
        mob.showMobile();

    }
}