import java.util.Scanner;

public class MyGPA {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter 4 grades: ");
            double Grade1 = input.nextDouble();
            double Grade2 = input.nextDouble();
            double Grade3 = input.nextDouble();
            double Grade4 = input.nextDouble();

            double GPA = (Grade1 + Grade2 + Grade3 + Grade4) / 4.0;

            System.out.println("Your GPA is : " + GPA);

            System.out.println("Do you wish to continue? (Yes = 1 / No = 0)");
            int repeat = input.nextInt();

            if(repeat == 0)
                break;
        }
        input.close();

    }
}
