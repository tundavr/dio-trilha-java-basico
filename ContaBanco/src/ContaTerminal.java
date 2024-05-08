import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        String agencia;
        String nomeCliente; 
        int numero;
        double saldo;


        System.out.println("Por favor, digite numero da Agência !");
        agencia = sc.next();

        System.out.println("Por favor, digite numero do usuario !");
        numero = sc.nextInt();

        System.out.println("Por favor, digite nome do Cliente !");
        nomeCliente = sc.next();

        System.out.println("Por favor, digite saldo da conta do Cliente !");
        saldo = sc.nextDouble();

        System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +   " , conta " + numero + " e seu " + saldo +  " ,saldo já está disponível para saque" );
        
        sc.close();	

    }
}