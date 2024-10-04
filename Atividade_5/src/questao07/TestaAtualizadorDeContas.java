package questao07;

public class TestaAtualizadorDeContas {
	public static void main(String[] args) {
		Conta c = new Conta();
		Conta cc = new Conta();
		Conta cp = new Conta();
		
		c.deposita(1500);
		cc.deposita(1300);
		cp.deposita(1200);
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);
		
		System.out.println("O saldo total é: "+ adc.getSaldoTotal());
	}
}
