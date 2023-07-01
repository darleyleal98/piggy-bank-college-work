package br.com.faculdade.trabalho;

public class Dolar extends Moeda {
    double valor;
    //Construtor da classe Dólar que chama o da Superclasse Moeda
    public Dolar(double valor) {
        this.valor = valor;
    }

    // Método Equals fará comparação entre o conteúdo dentro dos objetos
    @Override
    public boolean equals(Object objeto) {
        if (this.getClass() != objeto.getClass()) {
            return false;
        }
        Dolar objetoDolar = (Dolar) objeto;

        if (this.valor != ((Dolar) objeto).valor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dolar{}";
    }

    // Métodos instanciados com os atributos da classe Dólar
    @Override
    void info() {
        System.out.printf("Dólar: %.2f \n", valor);
    }

    @Override
    double converter() {
        return valor * 4.76; // Retorna Dólar * valor do Real
    }
}
