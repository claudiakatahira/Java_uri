import java.util.Scanner;
public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float a,b,c,p,x;

        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();

        if (a+b>c && b+c>a && a+c>b){
            p = a+b+c;

            System.out.printf("Perimetro = %.1f\n",p);
            
        }

        else{
            x=((a+b)*c)/2;
            System.out.printf("Area = %.1f\n",x);
        }

    }
}