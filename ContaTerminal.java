import java.util.Scanner;
public class ContaTerminal {
       public static void main(String[] args) {
              Scanner ler = new Scanner(System.in);
              int numero;
              String agencia,nome_cliente;
              float saldo;

              System.out.println("Bem-vindo ao Banco do Pipoquinha, prosseguindo para criação de conta:");

              System.out.println("Por favor Digite seu nome:");
              nome_cliente = ler.nextLine();

              System.out.println("Por favor digite o numero da Agência:");
              agencia = ler.nextLine();

              System.out.println("Por favor digite o numero da conta:");
              numero = ler.nextInt();

              System.out.println("Por favor digite o saldo de sua conta:");
              saldo = ler.nextFloat();

              System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f ja está disponível para saque",nome_cliente,agencia,numero,saldo);

              ler.close();
       }
}
