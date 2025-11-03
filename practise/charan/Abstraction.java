package charan;


public class Abstraction implements InnerAbstraction{

    @Override
    public int sub() {
        return 0;
    }

    @Override
    public int sub(int a, int b) {
        int c  = a - b;
        return c;
    }
    
}
