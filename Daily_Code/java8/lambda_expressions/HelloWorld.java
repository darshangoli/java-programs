package Daily_Code.java8.lambda_expressions;

@FunctionalInterface
interface InnerHelloWorld {
    void print(String name);
}
public class HelloWorld {
    public static void main(String[] args) {
        InnerHelloWorld darshan = (name) -> {System.out.println("Hello "+name);};
        darshan.print("Darshan");
    }
}



