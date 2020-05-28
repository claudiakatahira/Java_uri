import java.util.Scanner;
public class ex20{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int s;
        float h,p;

        System.out.println("Digite o sexo (0=homem e 1=mulher):");
        s = teclado.nextInt();
        System.out.println("Digite a altura");
        h = teclado.nextFloat();

        if (s==0){
            p = ((72.7f*h)-58f);

            System.out.println("O peso ideal e: "+ p);
            
        }

        else{
            p=((62.1f*h)-44.7f);
            System.out.println("O peso ideal e: "+ p);
        }

    }
}