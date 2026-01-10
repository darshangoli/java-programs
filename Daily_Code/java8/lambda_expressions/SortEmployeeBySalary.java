package java8.lambda_expressions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class VirtusaEmployee {
    private int id;
    private String name;
    private int salary;

    public VirtusaEmployee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

public class SortEmployeeBySalary {
    public static void main(String[] args) {
        List<VirtusaEmployee> employees = Arrays.asList(
                new VirtusaEmployee(3001, "darshan", 34000),
                new VirtusaEmployee(3002, "jaga", 14000),
                new VirtusaEmployee(3003, "sada", 20000),
                new VirtusaEmployee(3004, "akshay", 2000));

        employees.sort(Comparator.comparingInt(employee -> employee.getSalary()));

        employees.forEach(employee -> System.out.println(
                "ID: " + employee.getId() + ", Name: " + employee.getName() + ", Salary: " + employee.getSalary()));
    }
}
