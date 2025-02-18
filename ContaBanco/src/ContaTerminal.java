import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 237.48; //Para simular um saldo existente na conta

        System.out.println("----------Banco Nacional da Ilha de Java----------");
        System.out.println("\nBem-Vindo!!!\n");

        System.out.print("Digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Digite o número da sua contra: ");
        numeroConta = scanner.nextInt();

        System.out.print("Digite o número da sua agência: ");
        agencia = scanner.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
