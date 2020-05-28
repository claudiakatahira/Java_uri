import java.util.Scanner;
public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N;

        N = teclado.nextInt();

        for (int num=1; num<=4*N; num++){
            if (num%0 == 0){
                System.out.println("PUM");
            }
            else{
                System.out.println(num + " ");

            }
        }


    }
}