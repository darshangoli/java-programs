package charan;

public class Teacher {

    Student student;
    Teacher(Student student){
        this.student = student;
    }

    public void registerStudent(){
        int id = 3001;
        String name = "Darshan";
        String college = "Gitam";
        String phone = "8501088889";
        student.setId(id);
        student.setName(name);
        student.setCollege(college);
        student.setPhone(phone);
    }

    public String retreiveStudent(){
        return "id : "+student.getId()+
               " name : "+student.getName()+
               " college : "+student.getCollege()+
               " phone : "+student.getPhone();     
    }

    public static void main(String[] args) {
        Student student = new Student();
        Teacher obj = new Teacher(student);
        obj.registerStudent();
        System.out.println(obj.retreiveStudent());
    }
}
