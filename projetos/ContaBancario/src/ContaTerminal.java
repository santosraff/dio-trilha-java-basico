import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por gentileza, escreva o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite o número da agência:");
        String agencia = scanner.next();

        /*
         * Coloquei o saldo com um valor padrão.
         * No meu entendimento o saldo é algo
         * que não deva ser escrito pelo usuário
         */
        double saldo = 50.00;

        System.out.println("Olá ".concat(nomeCliente).concat(" obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ") + conta + " e seu saldo R$ " + saldo + " já está disponível para saque");

        scanner.close(); //adicionei para retirar a mensagem de problema 
    }
}
