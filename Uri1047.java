import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int h1,h2,total,h,m,diferenca,m1,m2,ht1,ht2;

        h=0;
        m=0;
        h1 = teclado.nextInt();
        h2 = teclado.nextInt();
        m1 = teclado.nextInt();
        m2 = teclado.nextInt();

        ht1 = h1*60 + m1;
        ht2 = h2*60 + m2;

        diferenca=ht2-ht1;

        if (diferenca==0){
            h=24;
            m=0;
        }
        else if(diferenca>0){
            h=diferenca/60;
            m=diferenca%60;

        }
        else if(diferenca<0){
            diferenca = (24*60-diferenca);
            h=diferenca/60;
            m=diferenca%60;
        }
        System.out.println("O JOGO DUROU " + h + " HORA(S) E " + m + " MINUTO(S)"); 
        }
        
    }