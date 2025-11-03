import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {
    public static void main(String[] args) {
        List<String> elements = Arrays.asList("satya","sravan","yuvan","darshan","roopesh");
        Collections.sort(elements, (s1, s2) -> s2.compareTo(s1));
        System.out.println("Descending order: " + elements);
    }
}
