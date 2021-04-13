import java.util.Scanner;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome, msg="";
		int idade;  
		/*Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite seu nome: ");
		nome = entrada.next();
		
		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();
		
		System.out.println("O nome digitado foi "+nome+ " com a idade "+idade);*/
		
		nome = JOptionPane.showInputDialog("Digite seu nome:");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite seu idade:"));
		
		/*JOptionPane.showMessageDialog(null, "O nome digitado foi "+nome);
		
		if (idade == 17) 
		{
			JOptionPane.showMessageDialog(null, " e sua idade é "+idade);
		}*/
		
		if (nome.equalsIgnoreCase("Marcela") && idade == 17)
		{
			JOptionPane.showMessageDialog(null, "seu nome é "+nome+ " e sua idade é "+idade);
		}
		
		for (int i=0; i<=idade; i++)
		{
			msg = msg +" "+ i;
		}
		JOptionPane.showMessageDialog(null, msg);
	}
	

		
}
