package Daily_Code.ExceptionHandling;

public class Arithmetic {
    public int divide(int a) throws ArithmeticException{
        return a/0;
    }
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        int a = 4;
        try{
            obj.divide(a);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally{
            System.out.println("Finally block executed");
        }
    }
}



