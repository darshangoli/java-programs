package Daily_Code.multithreading;

public class TwoThreadsSameMethod1{
    int count;
    synchronized void counter(){
        count++;
    }

    public static void main(String[] args) {
        TwoThreadsSameMethod1 obj = new TwoThreadsSameMethod1();

        Runnable r = () -> {
            for(int i=0; i<20000; i++){
                obj.counter();
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(obj.count);
    }
}



