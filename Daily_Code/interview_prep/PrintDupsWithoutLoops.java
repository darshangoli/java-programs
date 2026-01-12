package Daily_Code.interview_prep;

import java.util.HashSet;
import java.util.Set;

public class PrintDupsWithoutLoops {
    int[] printDups(int[] arr){
        Set<Integer> seen = new HashSet<>();
        Set<Integer> dups = new HashSet<>();
        for(int num : arr){
            if(!seen.add(num)){
                dups.add(num);
            }
        }
        int[] res = new int[dups.size()];
        int i = 0;
        for(int num : dups){
            res[i++] = num;
        }
        return res;
    }
    public static void main(String[] args) {
        PrintDupsWithoutLoops obj = new PrintDupsWithoutLoops();
        int[] arr = {1,3,2,4,3,5,4};
        int[] result = obj.printDups(arr);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
