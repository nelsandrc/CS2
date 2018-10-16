import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class MidtermReview {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter an integer: ");
        int userInt = input.nextInt();
        input.nextLine();
        System.out.println("The first digit is " + MidtermReview.firstDigit(userInt) + " and the last digit is " + MidtermReview.lastDigit(userInt));

    }

    public static int firstDigit(int number){
        int value = Math.abs(number);
        while(value > 10){
            value/=10;
        }
        return value;

    }

    public static int lastDigit(int number){
        return Math.abs(number%10);

    }
}
