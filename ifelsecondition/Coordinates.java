package ifelsecondition;
import java.util.Scanner;
public class Coordinates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("Enter the coordinates : ");
        x=sc.nextInt();
        y=sc.nextInt();
        if(x==0 && y==0){
            System.out.println("point is lies on origin ");
        }
        else if(x==0){
            System.out.println("point is lies on y-axis");
        }
        else if(y==0){
            System.out.println("point is lies on x-axis");
        }
        else{
            System.out.println("point is lies not lies on origin & y-axia & x-axis");
        }
    sc.close();    
    }
    
}
