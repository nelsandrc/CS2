import java.util.Scanner;

public class Assignment3_StudentInfo {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final int classSize = 100;

        int [] idNumbers = new int[classSize];
        String [] names = new String[classSize];
        int [] grade = new int[classSize];
        String [] email = new String[classSize];

        for(int place = 0; place < classSize; ++place){             //Promt the user for the ID, name, grade, and email for each student
            System.out.println("Enter the student's ID number: ");
            idNumbers[place] = input.nextInt();
            input.nextLine();
            System.out.println("Enter the student's full name: ");
            names[place] = input.nextLine();
            System.out.println("Enter the student's email: ");
            email[place] = input.nextLine();
            System.out.println("Enter the student's GPA: ");
            grade[place] = input.nextInt();
            input.nextLine();
        }

        for(int i = 0; i < classSize - 1; ++i){                     //Iterate through the class data, sorting by grade into non-descending order
            for(int j = 0; j < classSize - 1; ++j){
                if(grade[j] > grade[j+1]) {
                    Assignment3_StudentInfo.intSwap(j, grade);
                    Assignment3_StudentInfo.stringSwap(j, names);
                    Assignment3_StudentInfo.intSwap(j, idNumbers);
                    Assignment3_StudentInfo.stringSwap(j, email);
                }

            }
        }

        double sum = 0;
        System.out.println("ID No: ");                              //Print the class ID's after being sorted by grade and sums the grades for use in the average
        for (int i = 0; i < classSize; ++i) {
            sum += grade[i];
            System.out.println(idNumbers[i]);
        }

        System.out.println("Maximum grade was: " + grade[classSize-1] + ", Email: " + email[classSize - 1]);
        System.out.println("Minimum grade was: " + grade[0] + ", Email: " + email[0]);
        System.out.println("Average was: " + sum/classSize);

        input.close();
    }

    private static void intSwap(int index, int[] array){
        int temp = array[index + 1];
        array[index + 1] = array[index];
        array[index] = temp;

    }

    private static void stringSwap(int index, String[] array){
        String temp = array[index + 1];
        array[index + 1] = array[index];
        array[index] = temp;
    }


}
