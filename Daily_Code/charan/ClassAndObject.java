package charan;

class ClassAndObject {

    public int increment(int count){
        count += 1;
        return count;
    }
    public int decrement(int count){
        count -= 1;
        return count;
    }

    public static void main(String[] args) {
        int count = 5;
        ClassAndObject obj = new ClassAndObject();
        System.out.println(obj.increment(count));
        System.out.println(obj.decrement(count));
    }

}
