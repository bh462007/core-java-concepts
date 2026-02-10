class Circle{
    int radius;

    public Circle(int radius) {
        this.radius=radius;
    }
    void area(){
        double a=Math.PI*radius*radius;
        System.out.println("Area :"+a);
    }

    
    public static void main(String[] args) {
        Circle c1=new Circle(3);
        c1.area();
    }
}