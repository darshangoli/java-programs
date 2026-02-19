package Daily_Code.LeetCodeEasyProblems;

import java.util.LinkedList;
import java.util.List;

public class ReturnMiddleOfLinkedList {
    int middleOfLinkedList(List<Integer> linkedList){
        int middle = 0;
        if(linkedList.size() % 2 == 1){
            middle = (int)Math.ceil(linkedList.size()/2);
            return linkedList.get(middle);
        }
        middle = (int)(linkedList.size()/2);
        return linkedList.get(middle);
    }
    public static void main(String[] args) {
        ReturnMiddleOfLinkedList obj = new ReturnMiddleOfLinkedList();
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        System.out.println(obj.middleOfLinkedList(linkedList));
    }
}
