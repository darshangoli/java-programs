package Daily_Code.java8.lambda_expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface InnerFilterStrings {
    List<String> filterStringsStartsWithA(ArrayList<String> stringList);
}

public class FilterStrings {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("darshan","arun","anasuya","keerthana"));
        List<String> resultStrings = new ArrayList<>();
        InnerFilterStrings filter = (stringList) -> {
            for(String str : strings){
                if(str.startsWith("a")){
                    resultStrings.add(str);
                }
            }
            return resultStrings;
        };
        System.out.println(filter.filterStringsStartsWithA(strings));
    }
}



