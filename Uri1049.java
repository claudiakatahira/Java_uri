import java.util.Scanner;
public class Uri1049{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        String a,b,c;

        a = teclado.nextString();


        if (a=="vertebrado"){

            System.out.println("ele e vertebrado");
            
        }

        else{
            System.out.printf("ele e invertebrado");
        }

    }
}