import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        System.out.println("==========================");
        for (int i = 1; i < 11; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        System.out.println("==========================");
    }
}