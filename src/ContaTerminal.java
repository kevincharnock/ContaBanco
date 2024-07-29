import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Dados entrada

        System.out.println("Digite o número da conta");
         int numeroConta = sc.nextInt();
        System.out.println("Digite número da agência");
         String agencia = sc.next();


        //Dados Cliente
         String nomeCliente = "Josenildo";
         double saldo = 192.39;

        System.out.printf("Olá %s, Obrigado por criar uma conta em nosso banco, sua agência é: %s, conta: %d. Seu saldo: %.2f já está disponível para saque",nomeCliente,agencia,numeroConta,saldo);
    }
}