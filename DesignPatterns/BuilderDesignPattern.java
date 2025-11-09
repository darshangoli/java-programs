package DesignPatterns;

class Student{
    int id;
    String name;
    String school;
    String address;
    String section;

    private Student(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.school = builder.school;
        this.address = builder.address;
        this.section = builder.section;
    }

    public static class Builder{
        int id;
        String name;
        String school;
        String address;
        String section;

        public Builder setId(int id){
            this.id = id;
            return this;
        }
        public Builder seName(String name){
            this.name = name;
            return this;
        }
        public Builder setSchool(String school){
            this.school = school;
            return this;
        }
        public Builder setAddress(String address){
            this.address = address;
            return this;
        }
        public Builder setSection(String section){
            this.section = section;
            return this;
        }
        public Student build(){
            return new Student(this);
        }        
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", school=" + school + ", address=" + address + ", section="
                + section + "]";
    }
    
}
public class BuilderDesignPattern {
    public static void main(String[] args) {
        Student student = new Student.Builder()
                            .setId(3001)
                            .seName("Darshan")
                            .setAddress("Rajahmundry")
                            .build();
        System.out.println(student);
    }
}
