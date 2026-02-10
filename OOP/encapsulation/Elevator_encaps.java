class Elevator_encaps{
    private int currentFloor;
    private final int maxFloor;
    public Elevator_encaps(int maxFloor){
        this.currentFloor=0;
        this.maxFloor=maxFloor;
    }
    public void goUp(){
        if( currentFloor < maxFloor){
            currentFloor++;
        }
    }
    public void goDown(){
        if(currentFloor > 0 ){
            currentFloor--;
        }

    }
    public void goToFloor(int floor){
        if (0 <= floor && floor <= maxFloor) {
            currentFloor=floor;
        }
    }
    public int getCurrentFloor(){
        return currentFloor;
    }
    public static void main(String[] args) {
        Elevator_encaps ee1=new Elevator_encaps(5);
        
        ee1.goUp();
        ee1.goDown();
        ee1.goToFloor(4);
        System.out.println("Current floor: "+ee1.getCurrentFloor());
    }
}