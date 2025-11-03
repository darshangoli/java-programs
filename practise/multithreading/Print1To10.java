package multithreading;

public class Print1To10 {
    synchronized public static void print1to10(){
        for(int i=1; i<= 10; i++){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                print1to10();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                print1to10();
            }
        };
        t1.start();
        t2.start();
    }
}
