import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your temp in Fahrenheit --> ");
            double fahr = input.nextDouble();
            double celc = (fahr - 32.0) * (5.0 / 9);

            System.out.println("Temperature in Celsius is " + celc);

            System.out.println("Do you wish to continue? (Yes = 1 / No = 0)");
            int repeat = input.nextInt();

            if(repeat == 0)
                break;
        }
        input.close();
    }
}
