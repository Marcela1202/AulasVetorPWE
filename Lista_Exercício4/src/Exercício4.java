
import javax.swing.JOptionPane;

public class Exercício4 {

	public static void main(String[] args) {
		 int x, n1, n2;

	        String a = "";
	        
	        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
	        
	        if( (x <= 1) || (x >= 1000) ) 
	        	{
	        	JOptionPane.showMessageDialog(null,"Numero invalido!");
	        		System.out.println("Numero invalido!");
	            
	        	}
	        
	        else 
	        {
	        	for(int i = 1; i <= x; i++) 
	        	{

	        		n1 = i * i;
	        		n2 = n1 * i;

	        		a = i + " " + n1 + " " + n2;
	        		
	        		JOptionPane.showMessageDialog(null, a);	
	        		System.out.println(a);
	        	}

	        }

	}

}
