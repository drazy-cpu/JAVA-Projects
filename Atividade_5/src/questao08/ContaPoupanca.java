package questao08;

public class ContaPoupanca extends Conta{
	public void atualizaSaldo(double taxaPercentual) {
	     super.atualizaSaldo(3 * taxaPercentual);
	}
}
