package br.com.faculdade.trabalho;

public class Real extends Moeda {

    //Construtor da classe Real que chama o da Superclasse Moeda
    double valor;
    public Real(double valor) {
        this.valor = valor;
    }

    // Métodos instanciados com os atributos da classe Real
    @Override
    public boolean equals(Object objeto) {
        if (this.getClass() != objeto.getClass()) {
            return false;
        }
        Real objetoReal = (Real) objeto;

        if (this.valor != ((Real) objeto).valor) {
            return false;
        }

        return true;
    }

    // Método info retorna Moeda e valor em forma de lista
    @Override
    void info() {
        System.out.printf("Real: %.2f \n", valor);
    }

    @Override
    double converter() {
        return valor;
    }

}
