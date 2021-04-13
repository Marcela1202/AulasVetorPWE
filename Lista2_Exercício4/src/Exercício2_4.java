import java.util.Scanner;

public class Exercício2_4 {

	public static void main(String[] args) {
			
	double [] x = new double [10];
			
	Scanner scan = new Scanner(System.in);
		
	System.out.println("Insira os valores");	
	x[0] = scan.nextDouble();
		
	System.out.println("x[" + 0 + "] = " + x[0]);
			
	for (int i = 1; i < x.length; i++) 
		{
			x[i] = x[i-1] / 2;
			System.out.println("x[" + i + "] = " + x[i]);
		}

	}

}
