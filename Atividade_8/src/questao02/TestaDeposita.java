package questao02;

import java.util.Scanner;

public class TestaDeposita {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor a ser depositado: ");
        double valor = scanner.nextDouble();
        Conta cp = new ContaPoupanca();

        try {
            cp.deposita(valor);
        } catch (IllegalArgumentException e){
            System.out.println("Você digitou um valor inválido");
        }


    }
}
