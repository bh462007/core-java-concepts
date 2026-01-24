class LeftSumRightSum{
    public static void main(String[] args) {
        
        int[] arr={1,7,3,6,5,6};

        int[] prefix= new int[arr.length];

        prefix[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }

        int totalSum=prefix[prefix.length-1];
        for (int i = 0; i < prefix.length; i++) {

            int leftSum= (i==0)? 0:prefix[i-1];
            int rightSum=totalSum-prefix[i];

            if(leftSum == rightSum){
                System.out.println("Balanced index: "+i);
            }
        }
    }
}