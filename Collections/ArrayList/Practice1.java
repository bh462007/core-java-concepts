
import java.util.ArrayList;

class Practice1{
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        System.out.println("Printing all the elements:");
        for(Integer a:arr){
            System.out.println(a);
        }

        System.out.println("Inserting 25 at 2nd index");
        arr.add(2, 25);

        System.out.println("After modification");
        for(Integer a:arr){
            System.out.println(a);
        }

        arr.remove(Integer.valueOf(40));
        System.out.println("After removing");
        for(Integer a:arr){
            System.out.println(a);
        }

        int sizeArr=arr.size();
        System.out.println("Size of the elements: "+sizeArr);
    }
}