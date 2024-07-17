import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int saldo = 2500;
        int banco = 0;
        double deposito = 0;
        double transf = 0;

        System.out.println("""
                ******************************************************
                
                Nome: Lucas Fernandes de Almeida Silva
                Tipo de Conta: Corrente
                Saldo: 2500
                
                ******************************************************
                
                
                1 - Consultar Saldo
                2 - Depositar Valores
                3 - Transferir Valores
                4 - Sair
                """);
                banco = leitor.nextInt();

        switch (banco){
            case 1:
                if (banco == 1){
                    System.out.println("Seu saldo atual é: " + saldo);
            }break;

            case 2:
                if(banco == 2){
                    System.out.println("Qual valor você quer Desositar:  ");
                        deposito = leitor.nextDouble();
                        deposito = saldo + deposito;
                            System.out.println("Seu saldo atual é de:  " + deposito);
            }break;

            case 3:
                if(banco ==3){
                    System.out.println("Qual valor você quer transferir: ");
                        transf = leitor.nextDouble();
                        transf = saldo - transf;
                            System.out.println("Seu saldo atual é de:  " + transf);
            }break;
            case 4:
                if(banco ==4){
                    System.out.println("Obrigado pela Preferência!");
                }break;
        }
    }
}
