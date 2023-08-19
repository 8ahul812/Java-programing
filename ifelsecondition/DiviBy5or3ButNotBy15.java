package ifelsecondition;
import java.util.Scanner;
public class DiviBy5or3ButNotBy15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        if((n%3==0 || n%5==0 ) && n%15!=0){
            System.out.println(n+" is divisible by  5 or 3 but not by 15");
        }
        else{
            System.out.println(n+" is also divisible by 15");
        }
    sc.close();    
    }
}
