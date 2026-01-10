package DesignPatterns;

interface InnerPrototype {
    void shape();    
}
class Circle implements InnerPrototype{

    @Override
    public void shape() {
        System.out.println("Circle");
    }
        
}

class Square implements InnerPrototype{

    @Override
    public void shape() {
        System.out.println("Square");
    }
}

public class Prototype {
    public InnerPrototype createShape(String shape){
        if(shape.equals("circle")){
            return new Circle();
        }
        else if(shape.equals("square")){
            return new Square();
        }
        else{
            return null;
        }
    }    

    public static void main(String[] args) {
        InnerPrototype ip = new Prototype().createShape("circle");
        ip.shape();
    }
}
