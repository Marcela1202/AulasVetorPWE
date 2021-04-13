import javax.swing.JOptionPane; 

public class Exercício2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, men=0, posicao=0;
		int b[];
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor"));
		
		b = new int [a];
		
		for(int i=0; i<b.length; i++) {
			
			b[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor "
					+ "de b na posição "+ i));	
		}
		
		for (int z=0; z<b.length;z++) {
			if (z==0) {
				men=b[z];
			}
			
			if (b[z]<men) {
				men=b[z];
				posicao=z;
			}
		}
		
		System.out.println("O menor valor eh: "+men+"\n"+"Posição:"+posicao);
			
	}

}
