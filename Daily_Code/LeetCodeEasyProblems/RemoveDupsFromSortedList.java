package Daily_Code.LeetCodeEasyProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupsFromSortedList {
    List<Integer> deleteDups(List<Integer> list){
        Set<Integer> set = new HashSet<>(list);
        List<Integer> result = new ArrayList<>(set);
        return result;
    }
    public static void main(String[] args) {
        RemoveDupsFromSortedList obj = new RemoveDupsFromSortedList();
        List<Integer> list = Arrays.asList(1,3,2,3,1,2,5,4,5,6,7,6,4);
        System.out.println(obj.deleteDups(list));
    }
}
