class MathHelper{
    static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        else{
            return n*factorial(-1);
        }
    }

    static boolean  isEven(int n){
        return n%2==0;
    }

    public static void main(String[] args) {
        int fact=factorial(5);
        System.out.println("Factorial: "+fact);

        System.out.println();

        if(isEven(3)){
            System.out.println("Number is Even number");
        }
        else{
            System.out.println("Number is Odd number");
        }
    }
}