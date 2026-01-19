package Daily_Code.IRCTC;

import java.util.Scanner;

public class Ticketing {
    Passenger bookTicket(String name, int age) {
        int id = (int) (Math.random() * 10000);
        int seatNo = (int) (Math.random() * 100) + 1;
        Passenger passenger = new Passenger(id, name, age, seatNo);
        return passenger;
    }

    public static void main(String[] args) {
        Ticketing obj = new Ticketing();
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of passengers: ");
        int count = sc.nextInt();
        sc.nextLine();

        Passenger[] passengers = new Passenger[count];
        for (int i = 0; i < passengers.length; i++) {
            System.out.print("Enter " + (i + 1) + "th passenger name: ");
            String name = sc.nextLine();
            System.out.print("Enter " + (i + 1) + "th age: ");
            int age = sc.nextInt();
            sc.nextLine();
            passengers[i] = obj.bookTicket(name, age);

            System.out.println("Your Ticket is Booked");
            System.out.println((i + 1) + "th Passenger Name: " + passengers[i].getName());
            System.out.println((i + 1) + "Seat No: " + passengers[i].getSeatNo());
        }

    }
}
