package Daily_Code.java8.streams;

import java.util.Arrays;
import java.util.List;

public class GreaterThan10 {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,5,4,4,55,65,7,633,56,89,99,12);
        List<Integer> ans = li.stream()
                                .filter(i -> i > 10)
                                .toList();

        System.out.println(ans);
    }
}



