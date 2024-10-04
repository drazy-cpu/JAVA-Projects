package questao03;

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
	
	void mostraEmpregados(int posicao){
		System.out.println("O funcionário está na posição " + posicao);
		System.out.println("O nome do funcionário da posição " + posicao + " é: " + empregados[posicao].getNome());
		System.out.println("O salário do funcionário da posição " + posicao + " é: " + empregados[posicao].getSalario());
	}
	
	public boolean verificaFuncionario(Funcionario f) {
        for (int i = 0; i < auxiliar; i++) {
        	if (empregados[i].getId().equals(f.getId())) {
        	    return true;
        	}
        }
        return false;
    }
}
