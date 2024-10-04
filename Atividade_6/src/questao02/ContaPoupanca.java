package questao02;

public class ContaPoupanca extends Conta {
    public void atualizaSaldo(double taxaPercentual) {
        atualizaSaldo(3 * taxaPercentual);
    }
}