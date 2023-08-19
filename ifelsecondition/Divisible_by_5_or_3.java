package ifelsecondition;
import java.util.Scanner;
public class Divisible_by_5_or_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        if(n%3==0 || n%5==0){
            System.out.println(n+" is divisible by 5 or 3");
        }
        else{
            System.out.println(n+" is not divisible by 5 or 3");
        }
        sc.close();
    }
    
}
