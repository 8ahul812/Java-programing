package JavaLab;

import java.util.Scanner; 
public class IncomeTax {
    
	 void catogry(){
		 Scanner sc = new Scanner(System.in);                
		    System.out.print("Enter your category (General/Female): ");
		    String gender = sc.nextLine();
		    System.out.print("Enter your income: ");
		    int income = sc.nextInt();
	        if (gender.equalsIgnoreCase("General")) {
	        	if(income <= 180000) 
		 	 		System.out.println("No tax");	
	        	else if(income>180000 && income<=500000) 
		 	 		System.out.println("Tax = 10%");
	        	else if(income>500000 && income<=800000) 
		 	 		System.out.println("Tax = 20%");
	        	else
		 	 		System.out.println("Tax = 30%");
	        }
	        
	        // tax for womens
	        else if (gender.equalsIgnoreCase("Female")) {
	        	if(income <= 190000) 
		 	 		System.out.println("No Tax");	
	        	else if(income>190000 && income<=500000) 
		 	 		System.out.println("Tax = 10%");
	        	else if(income>500000 && income<=800000) 
		 	 		System.out.println("Tax = 20%");
	        	else
		 	 		System.out.println("Tax = 30%");
	        }
	        // invalid gender
	        else {
	            System.out.println("You entered invalid gender");
	        }
            sc.close();
	        }
	public static void main(String[] args) {
		       IncomeTax m=new IncomeTax();
		       m.catogry();  
		    }
		}