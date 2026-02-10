
class OnlineCart_encaps{
    private String productName;
    private double price;
    private int quantity;
    public void addItem(int qty){
        if( qty > 0){
            quantity=quantity=qty;
        }
        else{
            System.out.println("Quantity can not be negative");
        }
    }
    public void  removeItem(int qty){
        if(qty <= quantity && qty > 0){
            quantity=quantity-qty;
        }
        else{
            System.out.println("Cannot remove given quantity");
        }
    }
    public int getTotalPrice(){
        int total=(int) (price*quantity);
        return total;
    }
    public static void main(String[] args) {
        OnlineCart_encaps on1=new OnlineCart_encaps();
        on1.productName="Coke";
        on1.price=30;
        on1.quantity=3;
        System.out.println("Product: "+on1.productName);
        System.out.println("Total price: "+on1.getTotalPrice());
    }
}