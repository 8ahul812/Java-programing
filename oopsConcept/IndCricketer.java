package oopsConcept;

public class IndCricketer {
    String jeresyColor;
    int jeresyNo;
    void detail(String s,int x){
        jeresyColor=s;
        jeresyNo=x;
    } 
    public static void main(String[] args) {
            IndCricketer virat = new IndCricketer();
            virat.detail("blue",18);
            System.out.println(virat.jeresyColor+" "+virat.jeresyNo);
            virat.Rcb("red",18);
            virat.display();
        }
    // by using this keyword ----> same arg name as variable name
    void Rcb(String jeresyColor,int jeresyNo){
        this.jeresyColor=jeresyColor;
        this.jeresyNo=jeresyNo;
    }
    void display(){
        System.out.println(jeresyColor+" "+jeresyNo);
    }
}
