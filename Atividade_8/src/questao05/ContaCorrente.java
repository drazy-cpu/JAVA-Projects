package questao05;

public class ContaCorrente extends Conta {
    public void atualizaSaldo(double taxaPercentual) {
        atualizaSaldo(2 * taxaPercentual);
    }
}