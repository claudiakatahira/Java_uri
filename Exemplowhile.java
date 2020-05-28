import java.util.Scanner;
public class Exemplowhile{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int num,cont;

        System.out.println("Qual tabuada");
        num = teclado.nextInt();

        cont=1;

        while (cont<=1){
            System.out.println(num + " x " + cont + " = " + (num*cont));
        }

    }
}