import javax.swing.JOptionPane;

public class Exercício2 {

	public static void main(String[] args) {

		int n, x;
		String a = "";
		
		do {

		n = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos numeros serão testados (limite de 1007)"));

		} while((n < 1) || (n > 100));
		
		for (int i = 1; i <= n; i++) {
		
		
					
					 x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
					
			
			if (x == 2)
			{
				a += x + " eh primo" + "\n"; 
			
			}
			else if ((x/x == 1) && (x/1 == x) && ((x % 2 == 0) || (x % 3 == 0) || (x % 5 == 0)))
			{
				a += x + " não eh primo" + "\n"; 
				
			}
			
			else 
			{
				a += x + " eh primo" + "\n"; 
			
			}
		
		}
		JOptionPane.showMessageDialog(null, a);
	
	}

}
