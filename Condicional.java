public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if(anoDeLancamento >= 2022){
            System.out.println("Laçamento que os clientes estão curtindo");
        } else {
            System.out.println("Filme Retrô que vale a pena assistir");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("Plus")){
            System.out.println("Filme Liberado");
        }else {
            System.out.println("Deve pagar a locação");
        }
    }
}
