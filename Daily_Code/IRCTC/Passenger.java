package Daily_Code.IRCTC;

public class Passenger {
    int id;
    String name;
    int age;
    int seatNo;
    public Passenger(int id, String name, int age, int seatNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.seatNo = seatNo;
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getSeatNo() {
        return seatNo;
    }
    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }  
}
