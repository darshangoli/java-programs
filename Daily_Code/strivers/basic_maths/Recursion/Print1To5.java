package Daily_Code.strivers.basic_maths.Recursion;

public class Print1To5 {
    static void print1to5(int i,int n){
        if(i > n){
            return;
        }
        System.out.println(i);
        print1to5(i + 1, n);
    }
    public static void main(String[] args) {
        print1to5(1, 5);
    }
}



