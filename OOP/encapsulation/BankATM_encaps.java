class BankATM_encaps{
    private double balance;
    private final double dailylimit;
    public BankATM_encaps(double balance){
        if(balance > 0){
            this.balance=balance;
        }
        this.dailylimit=2000;
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= dailylimit && amount <= balance){
            balance=balance-amount;
            
        }
    }
    public void deposit(double amount){
        if(amount > 0){
            balance=balance+amount;
        }
    }
    public double getBalance(){
        return balance;
    }
    public void printStatus(){
        double bal= getBalance();
        System.out.println("Balance: "+bal);
    }
    public static void main(String[] args) {
        BankATM_encaps bank1=new BankATM_encaps(1500);
        bank1.deposit(500);
        bank1.withdraw(2000);
        bank1.printStatus();

    }
}