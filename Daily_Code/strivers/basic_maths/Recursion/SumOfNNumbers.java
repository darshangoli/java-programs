package Daily_Code.strivers.basic_maths.Recursion;

public class SumOfNNumbers {
    public static int sum(int i){
        if(i == 0){
            return 0;
        }
        return i + sum(i-1);
    }
    public static void main(String[] args) {
       System.out.println(sum(10));
    }
}



