import javax.swing.JOptionPane;

public class Vetor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[10];
		int mai=0, men=0, posicaomai=0, posicaomen=0;
		int troca=0;
		String saida = "";
		
		for (int i=0; i<a.length; i++) {
			a[i] = Integer.parseInt(JOptionPane.showInputDialog
					("Digite o valor de a["+i+"]"));
		}
		
		for (int i=0; i<a.length; i++) {
			if (i==0) {
				mai=a[0];
				men=a[0];
			}
			
			if (a[i]>mai) {
				mai=a[i];
				posicaomai=i;
			}
			
			if (a[i]>men) {
				men=a[i];
				posicaomen=i;
			}
		}
		
		String frag = "O maior número que foi digitado "+mai+ "na posição "+posicaomai+"\n"+
		"O menor número que foi digitado "+men+ "na posição "+posicaomen;
		
		JOptionPane.showMessageDialog(null, frag);
		
		for (int b = 0; b < a.length; b++) {
			for(int i=0; i<a.length; i++) {
				if (i!=0) {
					if (a[i]<a[i - 1]) {
						troca = a[i];
						a[i] = a[i - 1];
						a[i-1] = troca;
					}
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {
			saida+= "x["+i+"] = "+a[i]+ "\n";
		}
		
		JOptionPane.showMessageDialog(null, saida);
	}

}
