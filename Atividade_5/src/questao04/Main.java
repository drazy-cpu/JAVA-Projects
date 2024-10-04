package questao04;

public class Main {
	public static void main(String[] agrs) {
		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		c.deposita(1500);
		cc.deposita(1300);
		cp.deposita(1200);
		c.atualizaSaldo(0.01);
		cc.atualizaSaldo(0.01);
		cp.atualizaSaldo(0.01);
		System.out.println("Saldo da conta: " + c.getSaldo());
		System.out.println("Saldo da conta corrente: " + cc.getSaldo());
		System.out.println("Saldo da conta poupança: " + cp.getSaldo());
	}
}
