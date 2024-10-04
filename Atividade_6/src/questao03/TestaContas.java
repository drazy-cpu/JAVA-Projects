package questao03;

public class TestaContas {
    public static void main(String[] agrs) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        cc.deposita(1300);
        cp.deposita(1200);
        cc.atualizaSaldo(0.01);
        cp.atualizaSaldo(0.01);
        System.out.println("Saldo da conta corrente: " + cc.getSaldo());
        System.out.println("Saldo da conta poupança: " + cp.getSaldo());
    }
}