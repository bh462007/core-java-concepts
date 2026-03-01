
import java.util.ArrayList;

class IndexBasedTraversal{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);

        for (int i = 0; i <= 50; i=i+10) {
            list.add(i);
        }

        list.set(5, 100);

        for (int i = 0; i < list.size(); i++) {
            int a=list.get(i);
            System.out.println(i+" : "+a);
            if(list.get(i)==30){
                break;
            }
        }


    }
}