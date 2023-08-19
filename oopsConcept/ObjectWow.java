package oopsConcept;

public class ObjectWow {
        public static class Student{
            String name;
            int rollno;
            double percent;
        }
        public static class car{
            String name;
            int myledge;
        }
        public static void main(String[] args) {
            Student s1 = new Student();
            s1.name = "Virat";
            s1.rollno = 18;
            s1.percent = 100;
            System.out.println(s1.rollno);
            System.out.println(s1.rollno+7);
    
            Student s2 = new Student();
            s2.name = "Sachin";
            s2.rollno = 10;
            s2.percent = 100;
            System.out.println(s2.name);
    
            car c1 = new car();
            c1.name = "audi";
            c1.myledge = 76;
            System.out.println(c1.name);
            
        }
        
    }
