import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortElementsInArray {
    public Set<Integer> sort(int[] arr){
        Set<Integer> set = new TreeSet<>();
        for(int i : arr){
            set.add(i);
        }
        return set;
    }
    public static void main(String[] args) {
        SortElementsInArray obj = new SortElementsInArray();
        int[] arr = {4,3,5,4,4,67,8};
        System.out.println(obj.sort(arr));
    }
}
