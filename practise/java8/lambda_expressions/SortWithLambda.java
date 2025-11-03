package java8.lambda_expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@FunctionalInterface
interface InnerSortWithLambda {
    List<Integer> sortElements(ArrayList<Integer> list);    
}
public class SortWithLambda {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(13,2,4,34,5,11,8,7,99));
        InnerSortWithLambda sorter = (list) -> {
            Collections.sort(list);
            return list;
        };
        List<Integer> result = sorter.sortElements(numbers);
        System.out.println(result);
    }
}
