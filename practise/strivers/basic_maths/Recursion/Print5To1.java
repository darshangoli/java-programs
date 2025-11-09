package Recursion;

public class Print5To1 {
    static void print5to4(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        print5to4(n-1);
    }
    public static void main(String[] args) {
        print5to4(5);
    }
}
