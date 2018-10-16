import java.util.Scanner;
import java.util.Random; //Random WILL appear on all exams

public class SquarePractice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        char userSelection;
        int values[] = new int[100];
        do{

            //sort array
            //print max before sort
            //print min before sort
            for(int i = 0; i < values.length; i++){     //Initialize array with randoms values up to 1000
                values[i]= rand.nextInt(1001);
            }

            int min = values[0];
            int max = values[0];
            int sum = 0;
            int numberOf177 = 0;
            int betweenHundreds = 0;

            for(int i = 0; i < values.length; i++){   //Looks through the array to find the min, max, and number of 177's BEFORE sorting
                if(values[i] > max)                   //Also prints the numbers between 200 and 500 and sums for the average later
                    max = values[i];
                else if(values[i] < min)
                    min = values[i];
                if(values[i] == 177)
                    numberOf177++;
                if(200 <= values[i] && values[i] <= 500){
                    //System.out.println(values[i] + " is between 200 and 500.");
                    betweenHundreds++;
                }
                sum += values[i];
            }

            System.out.println("Array in reverse order: ");
            for(int i = values.length - 1; i >= 0; i--){
                System.out.print(values[i] + " ");
            }

            for(int i = 0; i < values.length - 1; i++){
                for(int j = 0; j < values.length - 1; j++){
                    if(values[j] > values[j+1]){
                        int temp = values[j+1];
                        values[j+1] = values[j];
                        values[j] = temp;
                    }
                }
            }
            System.out.println("\nMin: " + min);
            System.out.println("Max: " + max);
            System.out.println("Number of 177's: " + numberOf177);
            System.out.println("Numbers between 200 and 500: " + betweenHundreds);
            System.out.println("Average: " + (1.0*sum/values.length));
            System.out.println(" Sorted array: ");

            for(int i = 0; i < values.length; i++){
                System.out.print(values[i] + " ");
            }





            System.out.println("\nContinue? Y/N");
            userSelection = input.next().charAt(0);

        }while(userSelection == 'y'||userSelection == 'Y');
    }
}
