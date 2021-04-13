import java.util.Scanner;

public class Exercício2_2 {

	public static void main(String[] args) {
	
	 float[] n = new float[100];

	        
	 Scanner scan = new  Scanner(System.in);
	      
	 for(int i = 0; i < n.length; i++) 
	 {
	 System.out.println("Insira os valores");
	  n[i] = scan.nextInt();	            
	  }
	        
	 for(int i = 0; i < n.length; i++) 
	 {           
	 if( n[i] <= 10) 
	 {	 
	 System.out.println("n[" + i + "] = " + n[i]);
	       }
	            
	     }

	}

}
