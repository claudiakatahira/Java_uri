import java.util.Scanner;
public class Uri1050{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int d;

        d = teclado.nextInt();


        if (d==61){
            System.out.println("Brasilia");            
        }
        else{
            if (d==71){
                System.out.println("Salvador");
            }
            else {
                if (d==11){
                    System.out.println("Sao Paulo");
                }
                else {
                    if (d==21){
                        System.out.println("Rio de Janeiro");
                    }
                    else {
                        if(d==32){
                            System.out.println("Juiz de Fora");
                        }
                        else {
                            if (d==19){
                                System.out.println("Campinas");
                                
                            }
                            else {
                                if(d==27){
                                    System.out.println("Vitoria");

                                }
                                else {
                                    if (d==31){
                                        System.out.println("Belo Horizonte");

                                    }
                                    else {
                                        System.out.println("DDD nao cadastrado");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}