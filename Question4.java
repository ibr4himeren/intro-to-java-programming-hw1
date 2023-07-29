import java.util.Scanner;

/**
 *
 * @author ieren
 */
public class Question4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);		

        System.out.print("Enter a number less than 1000: ");
        int number = input.nextInt();

        int ones = number % 10;
        number /= 10;
        int tens = number % 10;
        number /= 10;
        int hundreds = number % 10;
        number /= 10;
        int sum = hundreds + tens + ones;

        System.out.println("The sum of the digits is " + sum);
    }
}
