package java8.streams;

import java.util.Arrays;
import java.util.List;

public class CountEvens {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,4,3,6,5,8,7,9);
        int count = (int) li.stream().filter(n -> n % 2 == 0)
                        .count();
        System.out.println(count);
    }
}
