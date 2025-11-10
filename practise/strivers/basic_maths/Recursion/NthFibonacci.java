package Recursion;

public class NthFibonacci {
    public static int fibonacci(int n){
        if(n <= 1){
            return 1;
        }
        return fibonacci(n-2) + fibonacci(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}