import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class MidtermReview {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter an integer: ");
        int userInt = input.nextInt();
        input.nextLine();
        System.out.println("The first digit is " + MidtermReview.firstDigit(userInt) + " and the last digit is " + MidtermReview.lastDigit(userInt));

        System.out.println("Enter two strings to be compared: ");
        String inputFirstString = input.nextLine();
        String inputSecondString = input.nextLine();

        if (MidtermReview.sameDashes(inputFirstString, inputSecondString))
            System.out.println("Same");
        else
            System.out.println("Different");

        int firstNum, secondNum, thirdNum;
        System.out.println("Enter three integers for midpoint testing: ");
        firstNum = input.nextInt();
        input.nextLine();
        secondNum = input.nextInt();
        input.nextLine();
        thirdNum = input.nextInt();
        input.nextLine();

        if (hasMidpoint(firstNum, secondNum, thirdNum))
            System.out.println("There is a midpoint.");
        else
            System.out.println("There is not a midpoint.");

        System.out.println("Enter an integer to test for odd digits: ");
        int oddTestInput = input.nextInt();

        if(MidtermReview.allDigitsOdd(oddTestInput))
            System.out.println("Digits are all odd.");
        else
            System.out.println("There is at least one even number. ");

    }

    public static int firstDigit(int number) {
        int value = Math.abs(number);
        while (value > 10) {
            value /= 10;
        }
        return value;

    }

    public static int lastDigit(int number) {
        return Math.abs(number % 10);

    }

    public static boolean sameDashes(String firstString, String secondString) {
        int firstLength = firstString.length();
        int secondLength = secondString.length();

        if (firstLength > secondLength) {                         //Iterate through the strings for the length of the longer string. At each place, compare the char. If one is a dash and the other isn't return false.
            for (int index = 0; index < firstLength; index++) {

                char charInFirst = firstString.charAt(index);
                char charInSecond = secondString.charAt(index);

                if (((charInFirst == '-') && (charInSecond != '-')) || ((charInSecond == '-') && (charInFirst != '-'))) {
                    return false;
                }
            }
        } else if (secondLength >= firstLength) {
            for (int index = 0; index < secondLength; index++) {

                char charInFirst = firstString.charAt(index);
                char charInSecond = secondString.charAt(index);

                if (((charInFirst == '-') && (charInSecond != '-')) || ((charInSecond == '-') && (charInFirst != '-'))) {
                    return false;
                }
            }
        }
        return true;

    }

    private static boolean hasMidpoint(int n1, int n2, int n3) {
        int first, second, third;
        first = n1;
        second = n2;
        third = n3;

        if (first > second) {
            int temp = second;
            second = first;
            first = temp;
        }
        if (second > third) {
            int temp = third;
            third = second;
            second = temp;
        }
        if (first > second) {
            int temp = second;
            second = first;
            first = temp;
        }
        double midpoint = (first + third) / 2.0;
        return midpoint == second;

    }

    public static boolean allDigitsOdd(int number) {
        int value = number;

        while (value > 0) {
            int currentDigit = value % 10;
            if (currentDigit % 2 == 0)
                return false;
            value /= 10;
        }
        return true;

    }
}
