package questao04;

public class Empresa {
	Funcionario[] empregados;
	String nome;
	String cnpj;
	String dataAbertura;
	int auxiliar = 0;
	
	public Empresa(int tamanho) {
        empregados = new Funcionario[tamanho];
    }
	
	void adiciona (Funcionario f) {
		this.empregados[auxiliar] = f;
		auxiliar++;
	}
	
	void mostraEmpregados(){
		for (int i = 0; i < this.empregados.length; i++) {
			System.out.println("O funcionário está na posição " + i);
			System.out.println("O nome do funcionário da posição " + i + " é: " + empregados[i].nome);
			System.out.println("O salário do funcionário da posição " + i + " é: " + empregados[i].salario);
		}
	}
}


