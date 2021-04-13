import java.util.Scanner;

public class Exercício5 {

    public static void main(String args[]) {

        int x = 0, gasolina = 0, alcool = 0, diesel = 0 ;

        Scanner cod = new Scanner(System.in);

        System.out.println("Digite o código dos produtos consumidos");

        while (x != 4) {

            x = cod.nextInt();

            if(x == 1) {
                alcool ++;
            }
            if(x == 2) {
                gasolina ++;
            }
            if(x == 3) {
                diesel ++;
            }
    }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.print("Diesel: " + diesel);
}
}