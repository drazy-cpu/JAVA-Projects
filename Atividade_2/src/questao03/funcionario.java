package questao03;

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
	
	public void mostra() {
		System.out.println(nome);
		System.out.println(rg);
		System.out.println(salario);
		System.out.println(departamento);
		System.out.println(dataEntrada);
	}
}
