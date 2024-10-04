package questao06;

public class ValorInvalidoException extends RuntimeException{

    ValorInvalidoException(double valor){
        super("Valor inválido" + valor);
    }

}
