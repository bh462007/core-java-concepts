
import java.util.ArrayList;

class Allinonemethods{
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        
        for (int i = 10; i < 100; i+=10) {
            arr.add(i);
        }
        System.out.println("After adding:");
        for(int list:arr){
            System.out.print(list+" ");
        }
        System.out.println();
        System.out.println("Accessing element at 5 index: "+arr.get(5));

        System.out.println("Updating element at 3 index:");
        arr.set(3, 300);
        for(int list:arr){
            System.out.print(list+" ");
        }
        System.out.println();

        System.out.println("Removing with index:");
        arr.remove(8);
        for(int list:arr){
            System.out.print(list+" ");
        }
        System.out.println();

        System.out.println("Removing 10 value:");
        arr.remove(Integer.valueOf(10));
        for(int list:arr){
            System.out.print(list+" ");
        }
        System.out.println();

        System.out.println("Size of list: "+arr.size());

        System.out.println("Does list contains 300?");
        if(arr.contains(300)){
            System.out.println("Contains!");
        }
        else{
            System.out.println("Does not contains!");
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
    }
}