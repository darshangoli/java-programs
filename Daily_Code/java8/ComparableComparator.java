package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee{
    private int empid;
    private String name;

    Employee(int empid, String name){
        this.empid = empid;
        this.name = name;
    }

    public int getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class ComparableComparator {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(3001, "Darshan"),
            new Employee(3002, "jagadeesh"),
            new Employee(3002, "akshay")
        );
        Comparator<Employee> comparator = (e1, e2) -> {
            if (e1.getEmpid() != e2.getEmpid()){
                return e2.getEmpid() - e1.getEmpid();
            }
            else{
                return e1.getName().compareTo(e2.getName());
            }
        };
        employees.sort(comparator);
        for(Employee emp : employees){
            System.out.println(emp.getEmpid() +" - "+ emp.getName());
        }
    }
}
