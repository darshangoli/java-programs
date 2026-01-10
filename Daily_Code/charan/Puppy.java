package Daily_Code.charan;

public class Puppy extends Dog{
    public void bark(){
        System.out.println("boo boo");
    }

    public static void main(String[] args) {
        Dog obj = new Puppy();
        obj.bark();
    }
}



