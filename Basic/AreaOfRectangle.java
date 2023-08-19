package Basic;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L,b;
        System.out.print("Enter the leangth and breath of rectangle : ");
        L=sc.nextInt();
        b=sc.nextInt();
        int area = L*b;
        System.out.println("area of the rectangle is "+area);
        sc.close();
    }
}
