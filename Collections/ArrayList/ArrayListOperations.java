
import java.util.ArrayList;

class ArrayListOperations{
    public static void main(String[] args) {
        ArrayList<String> fruites=new ArrayList<>();
        fruites.add("Orange");
        fruites.add("Mango");
        fruites.add(1,"Papaya");
        System.out.println("After adding: "+fruites);

        String s1=fruites.get(0);
        System.out.println("Accessing: "+s1);

        fruites.set(2,"Grapes");
        System.out.println("Updating: "+fruites);

        String s2=fruites.remove(1);
        System.out.println("Removing: "+s2);

        int s3=fruites.size();
        System.out.println("Size: "+s3);

        System.out.println("Iterate:");
        for(String st : fruites){
            System.out.println(" "+st);
        }

    }
}