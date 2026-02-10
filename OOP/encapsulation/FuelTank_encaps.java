class FuelTank_encaps{
    private final int capacity;
    private int currentFuel;
    public FuelTank_encaps(int currentFuel){
        this.capacity=100;
        if(currentFuel > 0 && currentFuel < capacity){
            this.currentFuel=currentFuel;
        }
        else{
            this.currentFuel=0;
        }
    }
    public boolean refill(int amount){
        if(amount > 0 && (currentFuel+amount) <= capacity){
            currentFuel=currentFuel+amount;
            return true;
        }
        return false;
    }
    public boolean consume(int amount){
        if(amount > 0 && currentFuel-amount > 0){
            currentFuel=currentFuel-amount;
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        return currentFuel==0;
    }
    public int getCurrentFuel(){
        return currentFuel;
    }
    public static void main(String[] args) {
        FuelTank_encaps ft1=new FuelTank_encaps(56);
        ft1.consume(20);
        ft1.consume(40);

        ft1.refill(32);
        System.out.println("Fuel: "+ft1.getCurrentFuel());
        System.out.println("Is empty: "+ft1.isEmpty());

    }
}