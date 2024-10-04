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
}
