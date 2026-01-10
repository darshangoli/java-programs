
public class Digits {
    public static void main(String[] args) {
        int num = 123456;
        int count = 0;
        while(num > 0){
            int digit = num % 10;
            num = num / 10;
            count += 1;
            System.out.println(digit);
        }
        System.out.println("count: "+count);
    }
}
