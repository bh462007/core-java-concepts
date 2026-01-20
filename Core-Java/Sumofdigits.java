class Sumofdigits{
    public static void main(String[] args) {
        int num=4321;
        int sum=0;

        while(num>0){
            int n=num%10;
            sum+=n;
            num/=10;
        }
        System.out.println("Sum of digits: "+sum);
    }
}