class Wallet_encaps{
    private String ownerName;
    private double balance;
    public Wallet_encaps(String ownerName, double balance){
        this.ownerName=ownerName;
        this.balance=balance;
    }
    public void addMoney(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
            return;
        }
        balance=balance+amount;
    }
    public void spendMoney(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
            return;
        }
        if(amount > balance){
            System.out.println("Insufficient balance");
            return;
        }
        balance=balance-amount;
    }
    public void printWallet(){
        System.out.println("Owner: "+ownerName+"\nBalance: "+balance);
    }
    public static void main(String[] args) {
        Wallet_encaps wal1=new Wallet_encaps("sam", 94239);
        wal1.addMoney(120);
        wal1.spendMoney(94239);
        wal1.printWallet();
        
    }
}