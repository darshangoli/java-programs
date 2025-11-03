public class FibonacciSeries {
    public static void fibonacci(int num){
        
        int first = 0;
        int second = 1;
        System.out.print(first+ " " +second);
        for(int i=2; i<=num; i++){
            int third = first + second;
            first = second;
            second = third;
            System.out.print(" " +third);
        }
    }
    public static void main(String[] args) {
        fibonacci(10);
    }
}
