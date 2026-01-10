package Daily_Code.java8.lambda_expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface FindLengths{
    Map<String,Integer> findLengths(List<String> list);
}

public class FindStringLengths {
    public static void main(String[] args) {
        FindLengths obj = (li) -> {
            int len = 0;
            Map<String,Integer> lens = new HashMap<>();
            for(String str : li){
                len = str.length();
                lens.put(str, len);
            }
            return lens;
        };
        List<String> strings = Arrays.asList("darshan","sravan","srinivasu","sai lakshmi");
        System.out.println(obj.findLengths(strings));
    }
}


