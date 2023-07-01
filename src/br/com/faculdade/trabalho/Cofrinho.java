package br.com.faculdade.trabalho;

import java.util.ArrayList;

public class Cofrinho {
    Moeda moeda;

    // Lista onde serão guardadas todas as moedas
    private ArrayList<Moeda> listaMoedas;

    public Cofrinho() {
        listaMoedas = new ArrayList<Moeda>();
    }

    @Override
    public String toString() {
        return "Cofrinho{" +
                "moeda=" + moeda +
                ", listaMoedas=" + this.listaMoedas +
                '}';
    }

    public ArrayList<Moeda> getListagemMoedas() {
        return this.listaMoedas;
    }

    public void setListaMoedas(ArrayList<Moeda> listaMoedas) {
        this.listaMoedas = listaMoedas;
    }

    // Método para adicionar moedas ao cofrinho
    public void adicionar(Moeda moeda) {
        this.listaMoedas.add(moeda);
    }

    // Método remove valor passado como parâmetro do cofrinho
    public boolean remover(Moeda moeda) {
         return this.listaMoedas.remove(moeda);
    }

    // Método faz a impressão de todas as moedas da lista
    public void listagemMoedas() {
        if (listaMoedas.size() == 0) {
            System.out.println("Ainda não há moedas disponíveis!");
        } else {
            System.out.println("Moedas disponíveis:");
            for (Moeda moeda : this.listaMoedas) {
                moeda.info();
            }
        }
    }

    // Método para calcular o valor total das moedas armazenadas no cofrinho
    public double totalConvertido() {
        double soma = 0;
        for (Moeda moeda : this.listaMoedas) {
            soma += moeda.converter();
        }
        return soma;
    }
}
