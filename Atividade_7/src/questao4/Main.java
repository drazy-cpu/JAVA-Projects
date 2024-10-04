package questao4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta c = new ContaCorrente();
        System.out.println("Digite o valor que deve ser depositado: ");
        double valor = scanner.nextDouble();
        c.deposita(valor);
        c.atualizaSaldo(0.01);

        Tributavel t = new ContaCorrente();
        t.deposita(c.getSaldo());


        System.out.println("Saldo da conta corrente: " + c.getSaldo());
        System.out.println("Tributo a ser pago: " + t.calculaTributo());
    }
}
