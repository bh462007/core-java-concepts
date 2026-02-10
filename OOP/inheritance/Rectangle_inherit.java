class Shape{
    void area(){
        System.out.println("this is not defined");
    }
}
class Rectangle_inherit extends Shape{
    int length, breadth;
    @Override
    void area(){
        int area=length*breadth;
        System.out.println("Area of rectangle: "+area);
    }
    public static void main(String[] args) {
        Rectangle_inherit rect=new Rectangle_inherit();
        rect.length=5;
        rect.breadth=3;
        rect.area();
    }
}