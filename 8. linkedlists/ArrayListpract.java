import java.util.ArrayList;
import java.util.Collections;
public class ArrayListpract {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(1);
        System.out.println(list);
        System.out.println(list.get(2));
        list.add(1,102);
        list.set(1,23);
        list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(3));
        System.out.println(list);
        boolean ans = list.contains(5);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.print(list);
    }
}
