package Basic;
import java.util.Scanner;
public class Egg_Quantity {
    public static void main(String[] args) {
    int eggs,gross,dozen,remain;    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the total Number of eggs = ");
    eggs = sc.nextInt();
    gross = eggs / 144;
    System.out.println("The number of gross who contain 144 eggs in one gross is = "+gross);
    dozen = eggs / 12;
    System.out.println("The number of eggs in dozen = "+dozen);
    remain = eggs % 12;
    System.out.println("The remaining eggs are = "+remain);
    sc.close();
    }
}
