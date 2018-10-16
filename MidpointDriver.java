import java.util.Scanner;

public class MidpointDriver {
    public static void main(String[] args){
        int firstNum, secondNum, thirdNum;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integers for midpoint testing: ");
        firstNum = input.nextInt();
        input.nextLine();
        secondNum = input.nextInt();
        input.nextLine();
        thirdNum = input.nextInt();

        if(hasMidpoint(firstNum, secondNum, thirdNum))
            System.out.println("There is a midpoint.");
        else
            System.out.println("There is not a midpoint.");

        input.close();
    }

    private static boolean hasMidpoint(int n1, int n2, int n3){
        int first, second, third;
        first = n1;
        second = n2;
        third = n3;

        if(first > second){
            int temp = second;
            second = first;
            first = temp;
        }
        if(second > third){
            int temp = third;
            third = second;
            second = temp;

        }
        if(first > second){
            int temp = second;
            second = first;
            first = temp;
        }


        int midpoint = (first + third)/2;
        return midpoint == second;

    }


}
