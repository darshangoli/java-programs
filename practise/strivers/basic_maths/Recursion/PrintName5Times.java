package Recursion;

public class PrintName5Times {
    static void printName(int i, int n){
        if(i > n){
            return;
        }
        System.out.println("Darshan");
        printName(i+1, n);
    }
    public static void main(String[] args) {
        printName(1, 5);
    }
}
