import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.print("Digite o número da agência: ");
        numero = scanner.nextInt();

        System.out.print("Digite o nome da agência: ");
        agencia = scanner.nextLine();

        scanner.nextLine();

        System.out.print("Digite o seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Digite o seu saldo: ");
        saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        
        scanner.close();
    }
}
