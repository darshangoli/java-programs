import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertZerosToTens {
    public static List<Integer> convert(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }
        return list.stream().map(n -> n == 0 ? 10 : n).collect(Collectors.toList());
    }  
    public static void main(String[] args) {
        int[] arr = {3,0,40,2,0,12};
        System.out.println(convert(arr));
    }
} 

