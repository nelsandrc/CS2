import java.util.Scanner;


public class GeneralPractice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number you want the multiples of and how many multiples of that number you want: ");
        int number = input.nextInt();
        input.nextLine();
        int iterations = input.nextInt();

        GeneralPractice.printMultiples(number,iterations);



        input.close();

    }

    public static void printMultiples(int input, int multiples){
        System.out.print(input);
        for(int i = 2; i <= multiples; ++i){
            int currentMultiple = input * i;
            System.out.print(", " + currentMultiple);
        }
    }
}
