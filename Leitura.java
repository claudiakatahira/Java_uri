import java.util.Scanner;
public class Leitura{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

        int a;
        float b;

        System.out.println("Digite um valor inteiro");
        a = teclado.nextInt();
        System.out.println("Digite um valor real");
        b = teclado.nextFloat();

        System.out.println("Voce digitou " + a + " e " + b);

    }
}