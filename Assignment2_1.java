import java.util.Scanner;

public class Assignment2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What magnitude is your earthquake?");
        double magnitude = input.nextDouble();

        if(magnitude >= 6.5)
            System.out.println("Catastrophe: most buildings destroyed.");
        else if(6 <= magnitude && magnitude < 6.5)
            System.out.println("Disaster: houses and buildings may collapse");
        else if(5.5 <= magnitude && magnitude < 6)
            System.out.println("Seriosu damage: walls may crack or fall");
        else if(5.0 <= magnitude && magnitude < 5.5)
            System.out.println("Some damage");
        else
            System.out.println("Little or no damage");

        input.close();
    }
}
