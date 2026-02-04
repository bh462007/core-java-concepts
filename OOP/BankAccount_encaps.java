class BankAccount_encaps{
    private int accountNumber;
    private double balance;

    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double balance(){
        return balance;
    }
    public void showBalance(){
        System.out.println("Accoutn number: "+accountNumber);
        if(balance > 0){
            System.out.println("Balance: "+balance);
        }
        else{
            System.out.println("Balance can not be zero");
        }
    }

    public static void main(String[] args) {
        BankAccount_encaps ba1=new BankAccount_encaps();
        ba1.setAccountNumber(225135);
        ba1.setBalance(90000);

        ba1.showBalance();
    }
}