package questao03;

public class ContaPoupanca implements Conta {

    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void atualizaSaldo(double taxaPercentual) {
        saldo += saldo * taxaPercentual * 3;
    }

    public void deposita(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido. O valor deve ser maior que zero.");
        }
    }

    public void saca(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }
}