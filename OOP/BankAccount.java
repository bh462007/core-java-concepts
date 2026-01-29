class BankAccount{
    int accNum;
    int balance;

    void showBalance(){
        if(balance > 700){
            System.out.println("Balance is "+balance+" of account number "+accNum);
        }
        else{
            System.out.println("Balance is not efficient to continue");
            System.out.println("Please add some of it");
        }
    }
    public static void main(String[] args) {
        BankAccount account=new BankAccount();
        account.accNum=101;
        account.balance=300;

        account.showBalance();
    }
}