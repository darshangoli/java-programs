package Daily_Code.strivers.basic_maths.Recursion;

public class NthFibonacci {
    public static int fibonacci(int n){
        if(n <= 1){
            return 1;
        }
        return fibonacci(n-2) + fibonacci(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<n; i++){
            System.out.print(fibonacci(i)+" ");
        }
        
    }
}



