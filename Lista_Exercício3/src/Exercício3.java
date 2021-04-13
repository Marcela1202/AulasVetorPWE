import javax.swing.JOptionPane;

public class Exercício3 {

	public static void main(String[] args) {
		 int num, x, z, soma;
	        z = 0;
	        soma = 0;
	        String sequencia = "";
	        
	      
	        
	        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
	        num = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor"));
	        
	        if(x > 0 && num > 0) 
	        {

	            if(x > num ) 
	            	{
	                	z = x;
	                	x = num;
	                	num = z;
	            	}
	        
	            for(int i = x; i <= num; i++) 
	            {
	            	sequencia = sequencia + i + " ";
	                soma = soma + i;
	            }
	            
	            	JOptionPane.showMessageDialog(null, sequencia + " = " + soma);
	            	sequencia = "";
	            	soma = 0;
	            	z = 0;
	        }
	        
	        
	     
	        

	}

}
