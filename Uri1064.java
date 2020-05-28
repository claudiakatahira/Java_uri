import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int cont;
        cont=0;
        float acumulador,num;
        acumulador=0;

        for (int i=0;i<6;i++){
            num=teclado.nextFloat();
            if(num>0){
                cont=cont+1;
                acumulador=acumulador+num;
            }            
        }

        System.out.println(cont + " valores positivos");
        System.out.printf("%.1f\n",(acumulador/cont));   

    }
}