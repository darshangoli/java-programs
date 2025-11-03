import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
    static List<Integer> reverse(List<Integer> li){
        Collections.reverse(li);
        return li;
    }
    public static void main(String[] args) {
        List<Integer> li = new LinkedList<>();
        li.add(3);
        li.add(4);
        li.add(1);
        li.add(7);
        li.add(0);
        System.out.println(reverse(li));
    }
}
