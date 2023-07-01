package br.com.faculdade.trabalho;

public class Euro extends Moeda {
    double valor;

    //Construtor da classe Euro que chama o da Superclasse Moeda
    public Euro(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object objeto) {
        if (this.getClass() != objeto.getClass()) {
            return false;
        }
        Euro objetoReal = (Euro) objeto;

        if (this.valor != ((Euro) objeto).valor) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Euro{}";
    }

    // Métodos instanciados com os atributos da classe Euro
    @Override
    void info() {
        System.out.printf("Euro: %.2f \n", valor);

    }
    @Override
    double converter() {
        return valor * 5.24;
    }
}
