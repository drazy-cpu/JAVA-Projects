package questao05;

public class Main {
	public static void main(String[] agrs) {
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		c.deposita(1500);
		cc.deposita(1000);
		cp.deposita(1200);
		c.atualizaSaldo(0.01);
		cc.atualizaSaldo(0.01);
		cp.atualizaSaldo(0.01);
		System.out.println("Saldo da conta: " + c.getSaldo());
		System.out.println("Saldo da conta corrente: " + cc.getSaldo());
		System.out.println("Saldo da conta poupança: " + cp.getSaldo());
		
		/*Sim, compila e roda, e sua utlidade reutilização de código*/
	}
}
