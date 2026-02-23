
import java.util.ArrayList;

class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Sam");
        names.add("Raj");
        names.add("Mihir");
        names.add("Kate");
        names.add("Jennie");

        System.out.println("Before removing..");
        for(String res:names){
            System.out.println(res);
        }

        names.remove(2);
        System.out.println("After removing..");
        for(String res:names){
            System.out.println(res);
        }
        
    }
}