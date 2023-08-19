package ifelsecondition;
import java.util.Scanner;
public class Divisible_by_5_and_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println(n+" is divisible by 3 and 5");
        }
        else{
            System.out.println(n+" is not divisible by 3 and 5");
        }

    sc.close();    
    } 
}
