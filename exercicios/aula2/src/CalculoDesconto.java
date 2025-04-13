public class CalculoDesconto {
    public static void main(String[] args) {
        double precoOriginal = 100.0;

        double percentualDesconto = 5.0;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;

        System.out.printf("\nPreço original.........: R$ %.2f", precoOriginal);
        System.out.printf("\nDesconto...............: R$ %.2f", valorDesconto);
        System.out.printf("\nNovo preço com desconto: R$ %.2f\n", novoPreco);
    }
}
