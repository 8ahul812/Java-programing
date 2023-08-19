package ifelsecondition;
import java.util.Scanner;
public class Absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n=sc.nextInt();
        if(n<0){
            n=n*(-1);
        }
    System.out.println("absolute value is "+n);
    sc.close();
    }
    
}
