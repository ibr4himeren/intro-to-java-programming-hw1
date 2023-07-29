import java.util.Scanner;

/**
 *
 * @author ieren
 */
public class Question6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Amount of water in kilograms: ");
        double m = input.nextDouble();
        System.out.println("Initial temp of water: ");
        double itemp = input.nextDouble();
        System.out.println("Final temp of water: ");
        double ftemp = input.nextDouble();

        double q = m * (ftemp - itemp) * 4184;

        System.out.println("The energy needed is: " + q);
    }
}
