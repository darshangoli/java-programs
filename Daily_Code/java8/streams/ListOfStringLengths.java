package Daily_Code.java8.streams;

import java.util.Arrays;
import java.util.List;

public class ListOfStringLengths {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("darshan","sravan","lakshmi","srinivasu");
        List<Integer> ans = li.stream().map(String::length).toList();
        System.out.println(ans);
    }
}



