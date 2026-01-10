package Daily_Code.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountElements {
    public int countElements(List<Integer> array){
        long result = array.stream().count();
        return (int)result;
    }
    public static void main(String[] args) {
        CountElements obj = new CountElements();
        List<Integer> list = new ArrayList<>(Arrays.asList(2,3,4,1,555,6,7,89,9));
        System.out.println(obj.countElements(list));
    }
}



