class Product_encaps{
    private int productId;
    private String name;
    private float price;
    private float quality;

    public void setProductID(int productId){
        this.productId=productId;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPrice(float price){
        this.price=price;
    }
    public void setQuality(float quality){
        this.quality=quality;
    }
    public void showProductDetails(){
        System.out.println("ID: "+productId+"\nName: "+name+"\nPrice: "+price+"\nQuality: "+quality+" %");
    }
    public static void main(String[] args) {
        Product_encaps pe1=new Product_encaps();
        pe1.setProductID(101);
        pe1.setName("coke");
        pe1.setPrice(30);
        pe1.setQuality((float) 4.3);
        pe1.showProductDetails();
    }
}