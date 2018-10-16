import java.util.Scanner;
import java.util.Random;

public class Assignment3_Lottery {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        final int lotterySize = 10;
        int [] lotteryNumbers = new int[lotterySize];

        for(int i = 0; i < lotterySize; ++i){ //Initialize lottery to -1, important for checking for duplicate numbers later
            lotteryNumbers[i] = -1;
        }

       /* for(int index = 0; index < lotterySize; ++index){
            System.out.print(lotteryNumbers[index] + " ");
        }*/

        int place = 0;

        while(place < lotterySize){
            int newLottoNumber = rand.nextInt(100);

            if(isIn(lotteryNumbers,newLottoNumber)){
                place = place;
            }
            else{
                lotteryNumbers[place] = newLottoNumber;
                ++place;
            }

        }

        System.out.println("Enter your lottery guess between 0 and 99: ");
        int guess = input.nextInt();

        if(isIn(lotteryNumbers,guess))
            System.out.println("You won!");
        else
            System.out.println("Better luck next time");


        for(int index = 0; index < lotterySize; ++index){
            System.out.print(lotteryNumbers[index] + " ");
        }

        input.close();
    }

    private static boolean isIn(int numberArray[], int newNumber){
        boolean result = false;
        for(int index = 0; index < numberArray.length; ++index){
            if(newNumber == numberArray[index]) {
                result = true;
            }
        }
        return result;
    }
}
