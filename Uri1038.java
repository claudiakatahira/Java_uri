import java.util.Scanner;
public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codigo, qtd;
        Float total;

        codigo = teclado.nextInt();
        qtd = teclado.nextInt();

        if (codigo==1){
            total = 4f * qtd;

            System.out.printf("Total: R$ %.2f\n",total);            
        }
        else{
            if(codigo==2){
                total= 4.5f * qtd;
                System.out.printf("Total: R$ %.2f\n",total);
            }
            else{
                if(codigo==3){
                    total = 5f * qtd;
                    System.out.printf("Total: R$ %.2f\n",total);
                }
                else {
                    if (codigo==4){
                        total = 2f*qtd;
                        System.out.printf("Total: R$ %.2f\n",total);
                    }
                    else {
                        if(codigo==5){
                            total = 1.5f * qtd;
                            System.out.printf("Total: R$ %.2f\n",total);
                        }
                    }
                }
            }
        }

    }
}