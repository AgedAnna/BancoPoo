import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);

        banco.adicionarConta(new Conta("123", "Cliente 1", 1000));
        banco.adicionarConta(new Conta("456", "Cliente 2", 2000));
        banco.adicionarConta(new Conta("789", "Cliente 3", 3000));

        while (true) {
            System.out.println("\nBem-vindo ao Banco Digital!");
            System.out.println("1. Buscar conta por número");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o número da conta: ");
                String numeroConta = scanner.next();

                try {
                    Conta contaEncontrada = banco.buscarContaPorNumero(numeroConta);
                    System.out.println("Conta encontrada: " + contaEncontrada.getNomeCliente());

                    while (true) {
                        System.out.println("\nO que você gostaria de fazer?");
                        System.out.println("1. Depositar");
                        System.out.println("2. Sacar");
                        System.out.println("3. Ver saldo");
                        System.out.println("4. Retornar ao menu principal");
                        System.out.print("Escolha uma opção: ");
                        int acao = scanner.nextInt();

                        switch (acao) {
                            case 1:
                                System.out.print("Digite o valor do depósito: ");
                                double valorDeposito = scanner.nextDouble();
                                contaEncontrada.depositar(valorDeposito);
                                System.out.println("Depósito realizado com sucesso.");
                                break;
                            case 2:
                                System.out.print("Digite o valor do saque: ");
                                double valorSaque = scanner.nextDouble();
                                contaEncontrada.sacar(valorSaque);
                                System.out.println("Saque realizado com sucesso.");
                                break;
                            case 3:
                                System.out.println("Saldo atual: " + contaEncontrada.getSaldo());
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Opção inválida.");
                                break;
                        }

                        if (acao == 4) {
                            break;
                        }   
                    }
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            } else if (opcao == 2) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}
