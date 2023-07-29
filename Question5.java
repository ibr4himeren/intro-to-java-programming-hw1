import java.util.Scanner;

/**
 *
 * @author ieren
 */
public class Question5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Minutes: ");
        int minutes = input.nextInt();

      
        int years = minutes / 525600;
        int days = (minutes % 525600) / 1440;

        System.out.println(minutes + " minutes is " + years
                + " years and " + days + " days");
    }
}
