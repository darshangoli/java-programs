package Recursion;

public class SumOfNNumbers {
    public static void sum(int i, int sum){
        if(i < 1){
            System.out.println(sum);
            return;
        }
        sum(i-1, sum+i);
    }
    public static void main(String[] args) {
        sum(10,0);
    }
}
