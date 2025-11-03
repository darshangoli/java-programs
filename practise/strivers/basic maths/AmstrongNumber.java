import java.util.ArrayList;
import java.util.List;

public class AmstrongNumber {
    public static boolean isAmstrong(int num){
        int originalNum = num;
        List<Integer> digits = new ArrayList<>();
        while(num > 0){
            int digit = num % 10;
            digits.add(digit);
            num = num / 10;
        }
        int size = digits.size();
        int sum = 0;
        for(int n : digits){
            sum = (int) (sum + Math.pow(n, size));
        }
        return sum == originalNum;
    }
    public static void main(String[] args) {
        int num = 153;
        System.out.println(isAmstrong(num));
    }
}
