import java.util.Scanner;

public class NumberSpell_V2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char userSelection;

        do{
            System.out.println("Please enter a number between [0 and 99]: ");
            int numericNum = input.nextInt();
            input.nextLine();

            if(NumberSpell_V2.isValid(numericNum))  //Verfies number is within range then calls int to string function
                System.out.println("Your number is " + NumberSpell_V2.numberSpell(numericNum));
            else
                System.out.println("Invalid entry, the number must be [0 to 99].");

            System.out.println("\nContinue? Y/N");
            userSelection = input.next().charAt(0);

        }while(userSelection == 'y'||userSelection == 'Y');

        System.out.println("Have a nice day!");
    }

    private static String numberSpell(int userInput) {       //Take the validated user input and return the String spelling that number
        int firstDigit = userInput / 10;
        int secondDigit = userInput % 10;

        String firstSpell;
        firstSpell = "";
        String secondSpell;
        secondSpell = "";

        if (firstDigit == 0) {                  //Special case switch statement 0-9
            switch (secondDigit) {
                case 0:
                    firstSpell = "Zero";break;
                case 1:
                    firstSpell = "One";break;
                case 2:
                    firstSpell = "Two";break;
                case 3:
                    firstSpell = "Three";break;
                case 4:
                    firstSpell = "Four";break;
                case 5:
                    firstSpell = "Five";break;
                case 6:
                    firstSpell = "Six";break;
                case 7:
                    firstSpell = "Seven";break;
                case 8:
                    firstSpell = "Eight";break;
                case 9:
                    firstSpell = "Nine";break;
                default:
                    firstSpell = "Hmmmmmm (0-9)";
            }
        } else if (firstDigit == 1) {                   //Special case switch statement for 10-19
            switch (secondDigit) {
                case 0:
                    secondSpell = "Ten";break;
                case 1:
                    secondSpell = "Eleven";break;
                case 2:
                    secondSpell = "Twelve";break;
                case 3:
                    secondSpell = "Thirteen";break;
                case 4:
                    secondSpell = "Fourteen";break;
                case 5:
                    secondSpell = "Fifteen";break;
                case 6:
                    secondSpell = "Sixteen";break;
                case 7:
                    secondSpell = "Seventeen";break;
                case 8:
                    secondSpell = "Eightteen";break;
                case 9:
                    secondSpell = "Nineteen";break;
                default:
                    secondSpell = "Weird (10-19)";break;
            }

        } else {                                    //Assigns first and second spelled numbers for 20-99
            switch (firstDigit) {
                case 2:
                    firstSpell = "twenty";break;
                case 3:
                    firstSpell = "thirty";break;
                case 4:
                    firstSpell = "forty";break;
                case 5:
                    firstSpell = "fifty";break;
                case 6:
                    firstSpell = "sixty";break;
                case 7:
                    firstSpell = "seventy";break;
                case 8:
                    firstSpell = "eighty";break;
                case 9:
                    firstSpell = "ninety";break;
                default:
                    firstSpell = "This shouldn't ever show up (tens)";break;
            }
            switch (secondDigit) {
                case 0:
                    secondSpell = "";break;
                case 1:
                    secondSpell = "-one";break;
                case 2:
                    secondSpell = "-two";break;
                case 3:
                    secondSpell = "-three";break;
                case 4:
                    secondSpell = "-four";break;
                case 5:
                    secondSpell = "-five";break;
                case 6:
                    secondSpell = "-six";break;
                case 7:
                    secondSpell = "-seven";break;
                case 8:
                    secondSpell = "-eight";break;
                case 9:
                    secondSpell = "-nine";break;
                default:
                    secondSpell = "This shouldn't ever show up (ones)";break;

            }
        }
        return firstSpell+secondSpell;

    }

    private static boolean isValid(int userInput){       //Checks that the user input is between 0 and 99 incluseive
        return 0 <= userInput && userInput <=99;
    }
}