package oopsConcept;
public class PlayerObj {
    void batting(){
        System.out.println("His batting average is 50 above in all three format");
    } 
    void feilding(){
        System.out.println("He taken 500 cathes");
    }
    public static void main(String[] args) {
        PlayerObj virat = new PlayerObj();
        virat.batting();
        virat.feilding();
        Footballer ronaldo = new Footballer();
        ronaldo.goal();
    }
    public static class Footballer{
        void goal(){
            System.out.println("He kiks the highest goal in the history og football ");
        }
    }

}
