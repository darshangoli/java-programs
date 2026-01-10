package Daily_Code.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumInList {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,4,3,6,5,2,7,9,8);
        int sum = li.stream().reduce(0, (a,b) -> a + b);
        System.out.println(sum);

        Optional<Integer> max = li.stream().reduce((a,b) -> a > b ? a : b);
        System.out.println(max.get());
    }
}



