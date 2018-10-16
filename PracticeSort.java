import java.util.Scanner;

public class PracticeSort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to sorted?");  //Determine how many numbers the user wants sorted and create an array to store those numbers
        int count = input.nextInt();
        int[] numbers = new int[count];

        System.out.println("Enter the " + count + " numbers you want sorted:");     //Fill array with user input of numbers
        for(int i=0;i<numbers.length;i++){
            numbers[i] = input.nextInt();
        }

        for(int i=0;i<numbers.length;i++){                              //Ye olde bubblesort because I can't remember my nice sorting methods
            for(int j=0;j<numbers.length-1;j++){
                if(numbers[j]>numbers[j+1]){
                    int temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j]=temp;

                }
            }
        }

        for(int i=0;i<numbers.length;i++){                              //Print sorted array
            System.out.print(numbers[i] + " ");
        }


    }
}
