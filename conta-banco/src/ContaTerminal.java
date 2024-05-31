import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)throws Exception{
        System.out.println("Hello, World!");
        System.out.println("Oi, fui executado pelo Terminal");

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite o numero da conta");
        int numero = scanner.nextInt();

    System.out.println("Digite o numero da sua Agencia");  
        String agencia = scanner.next();

    System.out.println("Digite o seu nome e sobrenome");  
        String nomeCliente = scanner.next();
    
    System.out.println("Olá, " + nomeCliente);
    System.out.println("Obrigado por criar uma conta em nosso banco!");
    System.out.println("Sua agencia e numero são  " + agencia  + numero);

    System.out.println("O seu saldo de 237.48 já está disponível para saque");


      
    
    }
}
