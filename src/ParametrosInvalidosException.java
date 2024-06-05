public class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(String mensagem){
        super(mensagem);
    }
    public static void ExcecaoNum1MaiorQueNum2() throws ParametrosInvalidosException {
        throw new ParametrosInvalidosException("Número 1 deve ser menor que o número 2");
    }
}
