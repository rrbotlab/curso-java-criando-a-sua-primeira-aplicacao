import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {
        String nomeCliente = "John Doe";
        String tipoConta = "corrente";
        double saldo = 87247.23;
        double valor = 0;
        int opcao = 0;

        String menu = """
                \n*** Digite a opção desejada ***
                1 - Consultar saldo
                2 - Tranferir valor
                3 - Receber valor
                4 - Sair
                """;

        System.out.println("******************************");
        System.out.println(" Cliente.......: " + nomeCliente);
        System.out.println(" Tipo de Conta.: " + tipoConta);
        System.out.println(" Saldo.........: " + saldo);
        System.out.println("******************************\n");

        Scanner input = new Scanner(System.in);

        // TODO: tratar exceptions
        while (opcao != 4){
            System.out.println(menu);

            opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println(">>>>> Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println(">>>>> Qual valor deseja tranferir? Saldo atual: " + saldo);
                    valor = input.nextDouble();
                    if (valor > saldo)
                        System.out.println(">>>>> Saldo insuficiente! Tente novamente");
                    else if (valor > 0) {
                        saldo -= valor;
                        System.out.println(">>>>> Transferencia realizada! Saldo atual: " + saldo);
                    } else
                        System.out.println("Valor digitado é inválido.");
                    break;
                case 3:
                    System.out.println(">>>>> Digite o valor a ser creditado. Saldo atual: " + saldo);
                    valor = input.nextDouble();
                    if (valor > 0) {
                        saldo += valor;
                        System.out.println("Valor creditado. Saldo atual: " + saldo);
                    } else
                        System.out.println("Valor digitado é inválido.");
                    break;
                case 4:
                    System.out.println("Atendimento encerrado!");
                    System.out.println("******** FIM *********");
                    break;
                default:
                    System.out.println(">>>>> Opção inválida!\n");

            }
        }
    }
}
