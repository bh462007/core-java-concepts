class Calculator{
    
    public static int multiply(int a, int b){
        int c=a*b;
        return c;
    }
    public static double square(int x){
        return x*x;
    }
    public static void main(String[] args) {
        int multi=multiply(34,2);
        System.out.println("Multiplication: "+multi);

        int s=(int) square(5);
        System.out.println("Square: "+s);

    }
}