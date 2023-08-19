package oopsConcept;

public class Constructors {
    public static class Players{
        String cricketer;
        int jeresyNo;
        double consistency;
        public Players(String name,int number,double Average){
            cricketer = name;
            jeresyNo = number;
            consistency = Average;
        }
    }
    public static void main(String[] args) {
        Players p1 = new Players("Virat",18,48.88);
        System.out.println(p1.jeresyNo);
    }
    
}
