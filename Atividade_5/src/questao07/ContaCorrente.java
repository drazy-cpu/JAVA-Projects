package questao07;

public class ContaCorrente extends Conta{

	 public void atualizaSaldo(double taxaPercentual) {
	     super.atualizaSaldo(2 * taxaPercentual);
	 }

	 public void deposita(double valor) {
	     super.deposita(valor - 0.10);
	 }
}

