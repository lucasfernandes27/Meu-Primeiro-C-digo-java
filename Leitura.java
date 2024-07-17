import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu Filme Favorito: ");
            String filme = leitura.nextLine();


        System.out.println("Qual o ano de Lançamento: ");
            int anoDeLancamento = leitura.nextInt();


        System.out.println("Diga de 0 a 10 qual a nota do filme");
            double avaliacao = leitura.nextDouble();


        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

    }
}
