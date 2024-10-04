package questao02;

public class funcionario {
	String nome;
	String departamento;
	double salario;
	String dataEntrada;
	String rg;
	
    
	public void recebeAumento(double aumento) {
        salario += aumento;
    }
    
	public double calculaGanhoAnual() {
    	return salario * 12;
    }
}
