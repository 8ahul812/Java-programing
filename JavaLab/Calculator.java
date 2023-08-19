package JavaLab;
import java.util.Scanner;
public class Calculator {
    int n;
    int d;
    Calculator(int num1,int num2){
        n=num1;
        d=num2;
        /*add(n);
        add(n,d);
        add(n,d,12);*/
    }
    int add (int a){
        return(a+5);
    }
    int add(int a, int b){
        return(a+b);
    }
    int add(int a,int b, int c){
        return(a+b+c);
    }
    /*void add (int a){
        System.out.println(a+5);
    }
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a,int b, int c){
        System.out.println(a+b+c);
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int x = sc.nextInt();
        System.out.print("Enter the number 2 : ");
        int y = sc.nextInt();
        Calculator c1 = new Calculator(x,y);
        int sum=c1.add(x,y);
        System.out.println(sum);
        int sum1 = c1.add(x,y,15);
        System.out.println(sum1);
        sc.close();
    } 
}
