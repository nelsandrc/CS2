import  java.util.Scanner;

public class Assignment2_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a two digit integer: ");
        int wholeNumber = input.nextInt();

        int firstDigit = wholeNumber/10;
        int secondDigit = wholeNumber%10;

       // System.out.println(firstDigit + " " + secondDigit);
        System.out.print("Your number is ");

        if(firstDigit == 1){
            switch (secondDigit){
                case 1:
                    System.out.println("eleven");break;
                case 2:
                    System.out.println("twelve");break;
                case 3:
                    System.out.println("thirteen");break;
                case 4:
                    System.out.println("fourteen");break;
                case 5:
                    System.out.println("fifteen");break;
                case 6:
                    System.out.println("sixteen");break;
                case 7:
                    System.out.println("seventeen");break;
                case 8:
                    System.out.println("eighteen");break;
                case 9:
                    System.out.println("nineteen");break;
                default:
                    System.out.println("This shouldn't ever show up (first switch)");break;
            }

        }
        else{
            switch (firstDigit){
                case 2:
                    System.out.print("twenty");break;
                case 3:
                    System.out.print("thirty");break;
                case 4:
                    System.out.print("forty");break;
                case 5:
                    System.out.print("fifty");break;
                case 6:
                    System.out.print("sixty");break;
                case 7:
                    System.out.print("seventy");break;
                case 8:
                    System.out.print("eighty");break;
                case 9:
                    System.out.print("ninety");break;
                default:
                    System.out.print("This shouldn't ever show up (second switch)");break;
            }
            switch (secondDigit) {
                case 0:
                    break;
                case 1:
                    System.out.println("-one");
                    break;
                case 2:
                    System.out.println("-two");
                    break;
                case 3:
                    System.out.println("-three");
                    break;
                case 4:
                    System.out.println("-four");
                    break;
                case 5:
                    System.out.println("-five");
                    break;
                case 6:
                    System.out.println("-six");
                    break;
                case 7:
                    System.out.println("-seven");
                    break;
                case 8:
                    System.out.println("-eight");
                    break;
                case 9:
                    System.out.println("-nine");
                    break;
                default:
                    System.out.println("This shouldn't ever show up (third switch)");
                    break;

            }
        }

        input.close();
    }
}
