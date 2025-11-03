import java.util.Arrays;
import java.util.Comparator;

public class SortBasedOnLengthOfString{
    public String[] sortLength(String[] arr){
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        return arr;
    }
    public static void main(String[] args) {
        SortBasedOnLengthOfString obj = new SortBasedOnLengthOfString();
        String[] arr = {"dar","cats","dogesg","rummy"};
        String[] sortedArr = obj.sortLength(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}
