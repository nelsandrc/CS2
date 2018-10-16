//Prompt user for value
//Iterate up to user value from  1, multiplying at each step
//Print value

import java.util.Scanner;

public class PracticeFactorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value you want the factorial of: ");
        int userValue = input.nextInt();
       /* for(int i = 1; i <= userValue; ++i){
            factorial *= i;
        }*/
        System.out.println(factor(userValue));

        input.close();

    }

    public static int factor(int value){
        int factorial = 1;
        for(int i = 1; i <= value; ++i){
            factorial *= i;
        }
        return factorial;
    }
}
