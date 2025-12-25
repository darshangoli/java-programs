import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertZerosToTens {
    public List<Integer> convert(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(arr[i]);
        }
        return list.stream().map(n -> n == 0 ? 10 : n).collect(Collectors.toList());

    }   

