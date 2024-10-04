package questao04;

import java.util.Scanner;

public class TestaDeposita {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor a ser depositado: ");
        double valor = scanner.nextDouble();
        Conta cc = new ContaCorrente();

        try {
            cc.deposita(valor);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
