import java.util.Scanner;

public class NamePractice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.println("Enter your last name:");
        String lastName = input.nextLine();

        System.out.println("Enter your full address: ");
        String address = input.nextLine();

        System.out.println("Name: " + firstName + " " + lastName +
                         "\nAddress: " + address);
        input.close();

    }
}
