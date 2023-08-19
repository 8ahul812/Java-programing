package oopsConcept;

public class NO_arg_const {
    int x;
    NO_arg_const(){  // No arguments
        System.out.println(x);
        System.out.println("No argument constructer");
    }
    public static void main(String[] args) {
        NO_arg_const obj = new NO_arg_const();
        
    }
    
}