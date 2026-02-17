abstract class Payment{
    abstract void pay(double amount);
    void receipt(){
        System.out.println("Payment successful");
    }
}

class UPIPayment extends Payment{
    public void pay(double amount){
        System.out.println("Paid "+amount+" using UPI");
    }
}
class CardPayment extends Payment{
    public void pay(double amount){
        System.out.println("Paid "+amount+" using Card");
    }
}
class CashPayment extends Payment{
    public void pay(double amount){
        System.out.println("Paid "+amount+" using Cash");
    }
}
class Cash{
    public static void main(String[] args) {
        Payment[] payments={
            new UPIPayment(),
            new CardPayment(),
            new CashPayment()
        };
        for (Payment p : payments) {
            p.pay(500);
            p.receipt();
            System.out.println();
        }

    }
}