package charan;

public class PassByValuePakka {
    public static void main(String[] args) {
        int a = 100;
        int b = a;
        b = 200;
        System.out.println(a);
        System.out.println(b);
    }
}
