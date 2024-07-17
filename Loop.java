import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
            double nota = 0;
            double mediaAvaliacao= 0 ;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga de 0 a 10 qual a nota do filme");
            nota = leitura.nextDouble();
            mediaAvaliacao = mediaAvaliacao + nota;
        }

        System.out.println("Media de Avaliações: " +mediaAvaliacao/3);
    }
}
