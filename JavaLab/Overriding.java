package JavaLab;
import java.util.Scanner;
class B{
    int n;
    int d;
    /*void add(int a, int b){
        System.out.println("it is sum of b class"+" "+(a+b));
    }*/
    int add(int a, int b){
        return(a+b);
    }
}
class Overriding extends B {
    int n;
    int d;
    Overriding(int num1,int num2){
        n=num1;
        d=num2;
        //add(n,d);
    }
    /*void add(int a, int b){
        System.out.println("its sum through Overriding : "+(a+b));
    }*/
    int add(int a, int b){
        return(a+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int x = sc.nextInt();
        System.out.print("Enter the number 2 : ");
        int y = sc.nextInt();
        Overriding c1 = new Overriding(x,y);
        int sum=c1.add(x,y);
        System.out.println(sum);
        sc.close();
    } 
}



