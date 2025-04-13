public class ConversaoDolaresReais {
    public static void main(String[] args) {
        double valorDolares = 88.5;
        double taxaCambio = 4.94;

        double valorReais = valorDolares * taxaCambio;

        System.out.printf("\nO valor em reais é: %.2f\n", valorReais);
    }
}
