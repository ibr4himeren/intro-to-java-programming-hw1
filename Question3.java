import java.util.Scanner;
/**
 *
 * @author ieren
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Subtotal: ");
        double subtotal = input.nextDouble();
        System.out.println("Gratuity rate: ");
        double rate = input.nextDouble();
        
        double gratuity = subtotal *(rate/100);
        double total = gratuity + subtotal;
        
        System.out.println("The gratuity is: " + gratuity + " the total is: " + total);
    }
    
}
