package questao08;

public class Conta {
	protected double saldo;
	
	public double getSaldo() {
		return saldo;
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
	
    public void atualizaSaldo(double taxaPercentual) {
        if (taxaPercentual > 0) {
            double aumento = saldo * (taxaPercentual / 100);
            saldo += aumento;
            System.out.println("Saldo atualizado com um aumento de " + aumento + ".");
        } else {
            System.out.println("Taxa percentual inválida. A taxa deve ser maior que zero.");
        }
    }
    
}
