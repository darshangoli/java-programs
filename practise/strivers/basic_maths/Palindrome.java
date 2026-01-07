public class Palindrome {
    public static void main(String[] args) {
        int num = 123433321;
        int original = num;
        int revNum = 0;
        while(num > 0){
            int lastNum = num % 10;
            revNum = (revNum * 10) + lastNum; 
            num = num / 10;
        }
        if(original == revNum){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
