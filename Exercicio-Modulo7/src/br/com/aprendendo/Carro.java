package br.com.aprendendo;

public class Carro {

    private int id;
    private String modelo;
    private String cor;
    private int anoLancamento;

    // Construtor
    public Carro(int id, String modelo, String cor, int anoLancamento) {
        this.id = id;
        this.modelo = modelo;
        this.cor = cor;
        this.anoLancamento = anoLancamento;
    }

    // Métodos getters e setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    // Método adicional
    public void ligarCarro() {
        System.out.println("Ligando carro!");
    }
}
