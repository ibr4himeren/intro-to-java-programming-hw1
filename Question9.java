import java.util.Scanner;
/**
 *
 * @author ieren
 */
public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Driving distance: ");
        double distance = input.nextDouble();
        System.out.println("Miles per gallon: ");
        double miles = input.nextDouble();
        System.out.println("Price per gallon: ");
        double price = input.nextDouble();
        
        double cost= (distance/miles) * price;
        
        System.out.println("The cost is: " + cost);
        
    }
}
