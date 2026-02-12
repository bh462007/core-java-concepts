class Account{
    long accNum;

    public Account(long accNum) {
        this.accNum=accNum;
        System.out.println("Account number: "+accNum);
    }
    

}
class SavingsAccount extends Account{
    double balance;

    public SavingsAccount(long accNum, double balance) {
        super(accNum);
        this.balance=balance;
        if(balance > 0){
            System.out.println("Balance: "+balance+" and Account number: "+this.accNum);
        }
    }
    public static void main(String[] args) {
        
        SavingsAccount sa1=new SavingsAccount(12345, -2234);
        SavingsAccount sa2=new SavingsAccount(54321, 5632);
    }
}