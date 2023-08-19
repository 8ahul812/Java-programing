package ifelsecondition;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        System.out.println("Enter the marks of the student : ");
        marks=sc.nextInt();
        if(marks>80){
            System.out.println("A Grade");
        }
        else if(marks>60){
            System.out.println("B Grade");
        }
        else if(marks>40){
            System.out.println("C Grade");
        }
        else{
            System.out.println("D Grade");
        }
    sc.close();    
    }
    
}
