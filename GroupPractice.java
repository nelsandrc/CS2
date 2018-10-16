import java.util.Scanner;

public class GroupPractice {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two doubles to be multiplied: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();

        GroupPractice.multiplication(n1, n2);
        GroupPractice.subtraction(n1, n2);

        input.close();
    }

    public static void multiplication(double firstNum, double secondNum){
        System.out.println(firstNum*secondNum);
    }
    public static void subtraction(double firstNum, double secondNum){
        System.out.println(firstNum - secondNum);
    }
}
