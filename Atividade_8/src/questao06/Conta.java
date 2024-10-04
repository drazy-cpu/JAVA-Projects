package questao06;

public abstract class Conta {
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public abstract void atualizaSaldo(double taxaPercentual);

    public void deposita(double valor) {
        if (valor < 0) {
            throw new ValorInvalidoException(valor);
        } else {
            System.out.println("Deposito de valor " + valor + " feito.");
            this.saldo += valor - 0.10;
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
}
