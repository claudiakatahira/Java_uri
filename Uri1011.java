import java.util.Scanner;
public class Uri1011{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double r,VOLUME;
        r = teclado.nextFloat();

        VOLUME=((4*3.14159*r*r*r)/3);

        System.out.printf("VOLUME = %.3f\n",VOLUME);

    }
}