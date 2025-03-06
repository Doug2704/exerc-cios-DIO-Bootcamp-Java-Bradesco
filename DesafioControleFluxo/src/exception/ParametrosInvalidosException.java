package exception;

public class ParametrosInvalidosException extends RuntimeException {
    public ParametrosInvalidosException() {
      super("O parâmetro 1 deve ser menor que o parâmetro 2");
    }
}
