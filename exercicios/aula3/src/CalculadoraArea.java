import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("\n============================");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção (1-3): ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o lado do quadrado: ");
                    double lado = scanner.nextDouble();
                    double areaQuadrado = lado * lado;
                    System.out.println("Área do quadrado: " + areaQuadrado);
                    break;
                case 2:
                    System.out.print("Digite o raio do círculo: ");
                    double raio = scanner.nextDouble();
                    double areaCirculo = 3.14 * raio * raio;
                    System.out.println("Área do círculo: " + areaCirculo);
                    break;
                case 3:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida!");

            }
        }
    }
}
