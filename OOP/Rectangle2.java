class Rectangle2{
    int length;
    int width;
    public Rectangle2(int l, int w){
        length=l;
        width=w;
    }

    public void area(){
        int a=length*width;
        System.out.println("Area: "+a);
    }

    public static void main(String[] args) {
        Rectangle2 rect=new Rectangle2(5,3);
        rect.area();
    }
}