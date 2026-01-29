class First{
    int fnumber;
    String sname;
    public void display(){
        System.out.println("Roll no: "+fnumber);
        System.out.println("Name: "+sname);
    }
    public static void main(String[] args) {
        First first=new First();
        first.fnumber=78;
        first.sname="Bhagyashree Pal";

        first.display();
    }
}