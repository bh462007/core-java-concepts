class BankAccount2{
    int accNum;
    double balance;

    public BankAccount2(int ac, double bal) {
        accNum=ac;
        balance=bal;
    }
    public void showBalance(){
        System.out.println("Account number: "+accNum+" has "+balance+" this much balance remaining");
    }
    
    public static void main(String[] args) {
        BankAccount2 acc=new BankAccount2(78,452000);
        acc.showBalance();
    }
}