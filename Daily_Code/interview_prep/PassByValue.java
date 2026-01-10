package Daily_Code.interview_prep;

class Person{
    String name;

    Person (String n){
        name = n;
    }
}

public class PassByValue{
    static void changeName(Person p){
        p.name = "Darshan";
    }

    public static void main(String args[]){
        Person person = new Person("Goli");
        System.out.println(person.name);  // primitives -> pass by value  "Goli"
        changeName(person);
        System.out.println(person.name);  // objects -> pass by reference "Darshan"
    }
}



