package questao03;

public class ContaPoupanca extends Conta {
    public void atualizaSaldo(double taxaPercentual) {
        saldo += saldo * taxaPercentual * 3;
    }

}
