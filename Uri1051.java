import java.util.Scanner;
public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float salario,imposto;

        salario = teclado.nextFloat();

        if (salario<=2000){

            System.out.println("isento");
        }
        else{
            if (salario>2000 && salario<=3000){
            imposto=(salario-2000)*(8/100);
            System.out.printf("R$ %.2f\n",imposto);
            }       
            else {
                if (salario>3000 && salario<4500){
                imposto = 1000*(8/100) + (salario-3000)*(18/100);
                System.out.printf("R$ %.2f\n",imposto);
                
                }
                else {
                    if(salario>=4500){
                    imposto=(1000*(8/100)+2000*(18/100)+(salario-4500)*(28/100));
                    System.out.printf("R$ %.2f\n",imposto);

                }
            }
        }
        }
    }
}