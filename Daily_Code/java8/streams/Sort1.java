package Daily_Code.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort1 {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,4,2,6,5,4,2);
        List<Integer> ans = li.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(ans);
    }
}



