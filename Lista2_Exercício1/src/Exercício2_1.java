import java.util.Scanner;

public class Exercício2_1 {

	public static void main(String[] args) {
		int [] n = new int [10];
		
		Scanner scan = new Scanner(System.in);
		
		
		
		do {
		System.out.println("Insira o valor"); 
		n[0] = scan.nextInt();
		
		}while(n[0] > 50);
		System.out.println("n[" + 0 + "] = " + n[0]);
		
		for (int i = 1; i < n.length; i++) 
			{
				n[i] = n[i-1] * 2;
				System.out.println("n[" + i + "] = " + n[i]);
			}

	}

}
