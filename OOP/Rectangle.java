class Rectangle{
    int length;
    int breadth;

    public void area(){
        int a=length*breadth;
        System.out.println("Area of reactangle: "+a);
    }
    public static void main(String[] args) {
        Rectangle rect=new Rectangle();
        rect.length=3;
        rect.breadth=9;
        rect.area();
    }
}