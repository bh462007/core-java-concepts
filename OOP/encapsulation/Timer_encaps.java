class Timer_encaps{
    private int seconds;
    public Timer_encaps(int seconds){
        if(seconds >= 0 && seconds <= 59){
            this.seconds=seconds;
        }
    }
    public void tick(){
        if(seconds == 59){
            seconds=0;
        }
        else{
            seconds++;
        }
    }
    public void reset(){
        seconds=0;
    }
    public int getTime(){
        return seconds;
    }
    public void printTime(){
        int sec=getTime();
        System.out.println("Time: "+sec);
    }
    public static void main(String[] args) {
        Timer_encaps te1=new Timer_encaps(45);
        te1.printTime();

        te1.tick();
        te1.printTime();

        te1.reset();
        te1.printTime();
    }
}