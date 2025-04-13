public class Produto{
    public static void main(String[] args) {
        double precoProduto = 2.49;
        int quantidade = 12;

        double total = precoProduto * quantidade;
        System.out.printf("\nO valor total da compra é R$ %.2f\n", total);
    }
}
