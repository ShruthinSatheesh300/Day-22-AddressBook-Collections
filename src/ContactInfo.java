import java.util.Scanner;

public class ContactInfo {

    Scanner scanner = new Scanner(System.in);

    public void info() {
        System.out.println("Enter First Name :");
        Person.firstName = scanner.next();
        System.out.println("Enter Last Name :");
        Person.lastName = scanner.next();
        System.out.println("Enter Address :");
        Person.address = scanner.next();
        System.out.println("Enter City :");
        Person.city = scanner.next();
        System.out.println("Enter State :");
        Person.state = scanner.next();
        System.out.println("Enter Zip :");
        Person.zip = scanner.nextInt();
        System.out.println("Enter Phone Number :");
        Person.phoneNumber = scanner.nextLong();
        System.out.println("Enter Email :");
        Person.email = scanner.next();
    }
}