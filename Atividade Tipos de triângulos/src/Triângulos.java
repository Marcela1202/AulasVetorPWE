import java.util.Scanner; 

import javax.swing.JOptionPane;

public class Triângulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a, b , c, guar = 0;
	    String angulo = "", formato = "";
	    Scanner s = new Scanner (System.in);
	    
	    System.out.println("Digite o valor do lado 1");
	    a = s.nextFloat();
	    System.out.println("Digite o valor do lado 2");
	    b = s.nextFloat();
	    System.out.println("Digite o valor do lado 3");
	    c = s.nextFloat();
	    
	    
	    if(a <= 0 || b <= 0 || c <= 0) {
	        System.out.println("Todos os seus valores devem ser acima de 0");
	    } else {
	        if(b > a) {
	            guar = a;
	            a = b;
	            b = guar;
	        }
	        if(c > a) {
	            guar = a;
	            a = c;
	            c = guar;
	        }
	        if(c > b) {
	            guar = b;
	            b = c;
	            c = guar;
	        }
	    //System.out.println(a + " " + b + " " + c);
	        if(b + c <= a) {
	            System.out.println("NAO FORMA TRIANGULO");
	            JOptionPane.showMessageDialog(null, "NAO FORMA TRIANGULO");
	        } else {
	            if((Math.pow(b, 2)) + (Math.pow(c, 2)) == (Math.pow(a, 2))) {
	                System.out.println("TRIANGULO RETÂNGULO");
	                angulo = "TRIANGULO RETANGULO";
	            }
	            if((Math.pow(b, 2)) + (Math.pow(c, 2)) < (Math.pow(a, 2))) {
	                System.out.println("TRIANGULO OBTUSANGULO");
	                angulo = "TRIANGULO OBTUSANGULO";
	            }
	            if((Math.pow(b, 2)) + (Math.pow(c, 2)) > (Math.pow(a, 2))) {
	                System.out.println("TRIANGULO ACUTANGULO");
	                angulo = "TRIANGULO ACUTANGULO";
	            }
	            if(a == b && b == c && c == a) {
	                System.out.println("TRIANGULO EQUILATERO");
	                formato = "TRIANGULO EQUILATERO";
	            }
	            if((a == b && c != a) || (a == c && b != a) || (b == c && a != b)) {
	                System.out.println("TRIANGULO ISOSCELES");
	                formato = "TRIANGULO ISOSCELES";
	            }
	            JOptionPane.showMessageDialog(null, angulo + "\n" + formato);
	        }
	    }
	}

}
