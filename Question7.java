import java.util.Scanner;

/**
 *
 * @author ieren
 */
public class Question7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      
        System.out.print("x1: ");
        double x1 = input.nextDouble();
        System.out.println("y1: ");
        double y1 = input.nextDouble();
        System.out.print("x2: ");
        double x2 = input.nextDouble();
        System.out.println("y2: ");
        double y2 = input.nextDouble();
        
        double distance = Math.pow(Math.pow(x2 - x1,2) + Math.pow(y2 - y1, 2),0.5);
                System.out.println("The distance is: " + distance);
    }
}
