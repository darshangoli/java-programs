package charan;

public class Polymorphism {
    public int add(int a, int b){
        int c = a + b;
        return c;
    }
    public int add(int a, int b, int c){
        int d = a + b + c;
        return d;
    }
    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
        System.out.println(obj.add(3, 4, 5));
    }
}
