import java.util.Scanner;
import  java.text.DecimalFormat;

public class Assignment2_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat();
        format.setMaximumFractionDigits(3);

        System.out.println("What do you want this summation to reach?");

        double limit = input.nextDouble();
        double currentNumber = 0;
        int iteration = 1;



        while(currentNumber < limit){
            if(limit < 1)
                break;
            else if(iteration == 1)
                System.out.print("1");
            else
                System.out.print(" + 1/" + iteration);
            currentNumber += + 1.0/iteration;
            iteration++;

        }

        if(currentNumber >= 1) {

            System.out.print(" = ");
            System.out.print(format.format(currentNumber));
        }
    }
}
