import java.util.Scanner;

public class Exercício2_3 {

	public static void main(String[] args) {

	int [] x = new int [10];
			
	Scanner scan = new Scanner(System.in);
			
	for (int i = x.length - 1; i >= 0; i--)
		{
		System.out.println("Insira os valores");
		x[i] = scan.nextInt();
		}
			
	for (int i = 0; i < x.length; i++)
		{
		System.out.println("x[" + i + "] = " + x[i]);
		}

	}

}
