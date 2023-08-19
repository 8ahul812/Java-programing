package Basic;
import java.util.Scanner;
public class wowmast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the digits = ");
        n = sc.nextInt();
        int sum = 0;
        int LD = 0; // LD --> Last Digit
        while(n!=0){
            LD = n%10;
            sum = sum + LD;
            n = n/10;
        }
        System.out.println("Sum of the digit are = "+sum);
        sc.close();
    }
}
