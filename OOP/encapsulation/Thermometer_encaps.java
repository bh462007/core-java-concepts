class Thermometer_encaps{
    private double temperature;

    public Thermometer_encaps(double temperature) {
        if(temperature < 0){
            this.temperature=0;
        }
        else{
            this.temperature = temperature;
        }
    }
    public void increaseTemp(double value){
        if(value <= 0){
            return;
        }
        else{
            temperature=temperature+value;
        }
    }
    public void decreaseTemp(double value){
        if(value < 0){
            return;
        }
        temperature-=value;
        if(value <= 0){
            this.temperature=0;
        }
    }
    public boolean isFever(){
        return temperature > 37.5;
          
    }
        
    public double getTemperature(double temperature){
        return temperature;
    }
    public static void main(String[] args) {
        Thermometer_encaps tm1=new Thermometer_encaps(50);
        tm1.increaseTemp(3);

        tm1.decreaseTemp(5);

        System.out.println("Temperature: "+tm1.getTemperature(23));

        if(tm1.isFever()){
            System.out.println("Fever..!");
        }
        else{
            System.out.println("Not fever..!");
        }

    }
}