package br.com.faculdade.trabalho;

/*
    Classe OpcaoInvalidaException herda características da classe Exception
    e será chamada pela classe Main sempre que o usuário tentar passar algum parâmetro
    incorreto.

 */
public class OpcaoInvalidaException extends Exception {
    public OpcaoInvalidaException() {
    }

    public OpcaoInvalidaException(String message) {
        super(message);
    }

    public OpcaoInvalidaException(String message, Throwable cause) {
        super(message, cause);
    }

    public OpcaoInvalidaException(Throwable cause) {
        super(cause);
    }

    public OpcaoInvalidaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
