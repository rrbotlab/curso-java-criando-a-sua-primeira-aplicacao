import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite um número inteiro: ");
        int numero = scanner.nextInt();

        //solução 1
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("1. O fatorial de " + numero + " é: " + fatorial);

        //solução 2
        fatorial = 1;
        for (int i = numero; i > 0; i-- )
            fatorial *= i;

        System.out.println("2. O fatorial de " + numero + " é: " + fatorial);
    }
}
