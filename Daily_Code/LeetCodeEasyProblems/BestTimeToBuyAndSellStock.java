package Daily_Code.LeetCodeEasyProblems;

import java.util.LinkedHashMap;
import java.util.Map;

public class BestTimeToBuyAndSellStock {
    int maxProfit(int[] arr){
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int num : arr){
            if(num < min){
                min = num;
            }
            else{
                maxProfit = Math.max(maxProfit, num - min);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();
        int[] arr = {7,1,5,3,6,4};
        System.out.println(obj.maxProfit(arr));
    }
}
