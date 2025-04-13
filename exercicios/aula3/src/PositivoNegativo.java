import java.util.Scanner;

public class PositivoNegativo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        while(numero != 999) {
            System.out.print("\nDigite um número inteiro (999 para sair): ");
            numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("O número " + numero + " é positivo");
            } else if (numero < 0) {
                System.out.println("O número " + numero + " é negativo");
            } else
                System.out.println("O número " + numero + " é neutro");

        }
    }
}