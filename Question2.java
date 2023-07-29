import java.util.Scanner;
/**
 *
 * @author ieren
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double kgperpound = 0.454;
        
        System.out.println("Insert number of pounds: ");
        double pound = input.nextDouble();
        
        double kg = pound * kgperpound;
        
        System.out.println(pound +" pounds is: " + kg + " kilograms");    
    }
}
