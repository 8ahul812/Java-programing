package ifelsecondition;
import java.util.Scanner;
public class Greatest_in_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter the first number : ");
        a=sc.nextInt();
        System.out.print("Enter the second number : ");
        b=sc.nextInt();
        System.out.print("Enter the third number : ");
        c=sc.nextInt();
        if(a>c && a>b){
            System.out.println(a+" is the greatest ");
        }
        else if(b>a && b>c){
            System.out.println(b+" is the greatest");
        }
        else{
            System.out.println(c+" is the greateest");
        }
    sc.close();    
    }
}
