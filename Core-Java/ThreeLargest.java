

class ThreeLargest{
    public static void main(String[] args) {
        int n1=23;
        int n2=54;
        int n3=1;
        if(n1>n2 && n1>n3){
            System.out.println(n1+" is largest");   
        }
        else if(n2>n1 && n2>n3){
            System.out.println(n2+" is largest");
        }
        else{
            System.out.println(n3+" is largest");
        }
    }
}