class Circle_encaps{
    private double radius;
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void calculateArea(){
        int area=(int) (Math.PI*radius*radius);
        System.out.println("Area of circle: "+area);
    }
    public static void main(String[] args) {
        Circle_encaps c1=new Circle_encaps();

        c1.setRadius(4.6);
        System.out.println("Radius: "+c1.getRadius());
        c1.calculateArea();

    }
}