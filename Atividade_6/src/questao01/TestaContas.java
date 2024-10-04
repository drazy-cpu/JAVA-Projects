package questao01;

public class TestaContas {
    public static void main(String[] agrs) {
    	Conta c = new Conta();
    	//Ocorre um erro, pois a conta foi declarada como abstrata e não pode receber uma referência a Conta como argumento.
        c.deposita(1500);
        System.out.println("Saldo da conta: " + c.getSaldo());
    }
}