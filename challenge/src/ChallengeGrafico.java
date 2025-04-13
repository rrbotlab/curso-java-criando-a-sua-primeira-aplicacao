import javax.swing.*;

public class ChallengeGrafico {

    static String nomeCliente = "Tio Patinhas";
    static String tipoConta = "corrente";
    static double saldo = 251970.05;

    private static void processarTransferencia(JFrame frame){

        double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para transferir: "));
        if (valor > saldo)
            JOptionPane.showMessageDialog(frame,"Saldo insuficiente!","Erro",JOptionPane.ERROR_MESSAGE);
        else if (valor > 0){
            saldo -= valor;
            JOptionPane.showMessageDialog(frame,"Transferencia realizada. Saldo atual: " + saldo,"Sucesso",JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(frame,"Valor Inválido!","Erro",JOptionPane.ERROR_MESSAGE);
    }

    private static void processarDeposito(JFrame frame){

        double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para receber: "));
        if (valor>0){
            saldo += valor;
            JOptionPane.showMessageDialog(frame,"Recebimento realizado. Saldo atual: " + saldo,"Sucesso",JOptionPane.INFORMATION_MESSAGE);
        }else
            JOptionPane.showMessageDialog(frame,"Valor Inválido!","Erro",JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        // Cria a janela principal
        JFrame frame = new JFrame("Challenge - Versão Gráfica");
        frame.setSize(1280, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");

        JMenuItem dadosDaConta = new JMenuItem("Dados da Conta");
        JMenuItem consultarSaldo = new JMenuItem("Consultar saldo");
        JMenuItem fazerTransferencia = new JMenuItem("Fazer transferência");
        JMenuItem receberValor = new JMenuItem("Receber valor");
        JMenuItem sair = new JMenuItem("Sair");

        menu.add(dadosDaConta);
        menu.addSeparator();
        menu.add(consultarSaldo);
        menu.add(fazerTransferencia);
        menu.add(receberValor);
        menu.addSeparator();
        menu.add(sair);

        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        dadosDaConta.addActionListener(e -> {
            String message = String.format("Cliente: %s\nTipo de Conta: %s\nSaldo atual: %.2f", nomeCliente,tipoConta,saldo);
            JOptionPane.showMessageDialog(frame, message, "Dados da Conta", JOptionPane.INFORMATION_MESSAGE);
        });

        consultarSaldo.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Seu saldo atual é: " + saldo, "Saldo", JOptionPane.INFORMATION_MESSAGE);
        });

        fazerTransferencia.addActionListener(e -> {
            processarTransferencia(frame);
        });

        receberValor.addActionListener(e -> {
            processarDeposito(frame);
        });

        sair.addActionListener(e -> System.exit(0));

        frame.setVisible(true);
    }
}
