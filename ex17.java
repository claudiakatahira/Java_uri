import java.util.Scanner;
public class ex20{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float bruto,imposto,liquido;

        System.out.println("Digite o salario");
        bruto = teclado.nexFloat();

        if (bruto <= 1000){
            imposto=0;            
        }

        else{
            if (bruto<=2500){
                imposto=bruto*12.5f/100;
            }
            else{
                if (bruto=<=5000){
                    imposto=bruto*25/100;
                }
                else {
                    imposto=1300;
                }
            }

        }

        System.out.println("o imposto e: " + imposto);
        System.out.println("o salario liquido e: " + imposto);

    }
}