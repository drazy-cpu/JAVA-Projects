package questao09;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas (double selic) {
		this.selic = selic;
	}
	
	public void roda(Conta c) {
		System.out.println("O saldo anterior é: " + c.saldo);
		double aumento = c.saldo * selic;
		c.saldo += aumento;
		System.out.println("O saldo final é: " + c.saldo);
		saldoTotal += c.saldo;
	}
	
	public double getSaldoTotal() {
		return saldoTotal;
	}
}