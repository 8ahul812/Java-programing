package ifelsecondition;
import java.util.Scanner;
public class QuatraticEqn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,D;
        System.out.print("Enter the value of a : ");
        a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        b = sc.nextInt();
        System.out.print("Enter the value of c : ");
        c = sc.nextInt(); 
        D = b*b-4*a*c;
        if(D>0){
            System.out.println("Roots are real");
        }
        else if(D==0){
            System.out.println("Roots are equal");
        }
        else{
            System.out.println("Roots are imaginary");
        }
    sc.close();    
    }
}
