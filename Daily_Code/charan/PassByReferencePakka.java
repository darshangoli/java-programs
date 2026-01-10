package Daily_Code.charan;

class Student{
    int id;
    String name;
    String dept;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    
}
public class PassByReferencePakka {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(3001);
        s1.setName("Darshan");
        s1.setDept("CSE");
        System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getDept());
        
        Student s2 = s1;
        s2.setId(3002);
        s2.setName("jaga");
        s2.setDept("cse");
        System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getDept());
        System.out.println(s2.getId()+" "+s2.getName()+" "+s2.getDept());
    }
}



