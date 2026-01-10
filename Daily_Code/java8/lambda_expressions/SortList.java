package Daily_Code.java8.lambda_expressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface SquareWithLambda{
    List<Integer> squaretWithLambda(List<Integer> list);
}

public class SortList {
    public static void main(String[] args) {
        SquareWithLambda obj = (list) -> {
            return list.stream().sorted().map(i -> i*i).collect(Collectors.toList());
        };

        List<Integer> li = Arrays.asList(8,1,2,5,3);
        System.out.println(obj.squaretWithLambda(li));
        
    }
}



