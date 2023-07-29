import java.util.Scanner;
            
/**
 *
 * @author ieren
 */
public class Question1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double pi = 3.14;
        
        System.out.println("Radius : ");
        double radius = input.nextDouble();
        
        System.out.println("Length : ");
        double length = input.nextDouble();
        
        double area , volume;
        area = radius * radius * pi;
        volume = area * length;
        
        System.out.println("Area : " + area);
        System.out.println("Volume : " + volume);
    }
}
