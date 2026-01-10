package Daily_Code.java8.lambda_expressions;

import java.util.Arrays;
import java.util.List;

public class SumOfAllElementsInList {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 4, 23, 7);
        int result = li.stream().reduce(0, (a, b) -> a + b);
        System.out.println(result);
    }
}



