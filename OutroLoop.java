import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        double mediaAvaliacao= 0 ;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga de 0 a 10 qual a nota do filme ou -1 para encerrar");
                nota = leitura.nextDouble();

                if (nota != -1){
                    mediaAvaliacao = mediaAvaliacao + nota;
                    totalDeNotas++ ;
                }

        }

        System.out.println("Media de Avaliações: " +mediaAvaliacao/totalDeNotas);
    }
}
