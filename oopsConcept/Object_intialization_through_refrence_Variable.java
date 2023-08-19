package oopsConcept;

public class Object_intialization_through_refrence_Variable {  // class name cricketer
    
    public static void main(String[] args) {
        Cricketer virat = new Cricketer();
        virat.jeresyColor="blue";
        virat.jeresyNo=18;
        System.out.println(virat.jeresyColor+" "+virat.jeresyNo);
    }
    public static class Cricketer{
        String jeresyColor;
        public int jeresyNo;
    }
}
