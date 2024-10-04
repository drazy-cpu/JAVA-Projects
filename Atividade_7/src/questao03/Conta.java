package questao03;

public interface Conta {
    public double getSaldo();

    public void atualizaSaldo(double taxaPercentual);

    public void deposita(double valor);

    public void saca(double valor);
}
