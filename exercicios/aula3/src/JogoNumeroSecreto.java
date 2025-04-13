import java.util.Random;
import java.util.Scanner;

public class JogoNumeroSecreto {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
        int tentativas = 0;
        int numeroDigitado = 0;
        
        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            numeroDigitado = input.nextInt();
            tentativas++;

            if (numeroDigitado == numeroSecreto) {
                if (tentativas == 1)
                    System.out.println("Parabéns, você acertou o número secreto em " + tentativas + " tentativa!");
                else
                    System.out.println("Parabéns, você acertou o número secreto em " + tentativas + " tentativas!");
                break; // interrompe o loop while
            } else if (numeroDigitado < numeroSecreto) {
                System.out.println("O número digitado é MENOR que o número secreto.\n");
            } else {
                System.out.println("O número digitado é MAIOR que o número secreto.\n");
            }
        }

        if (numeroDigitado != numeroSecreto) {
             System.out.println("Você não conseguiu acertar o número em " + tentativas + " tentativas. O número era: " + numeroSecreto);
        }
    }
}
