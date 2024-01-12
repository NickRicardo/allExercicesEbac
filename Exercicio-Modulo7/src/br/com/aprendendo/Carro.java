package br.com.aprendendo;

import java.io.DataInputStream;

public class Carro {

    private int id;

    private String modelo;

    private String cor;

    private DataInputStream ano;

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

    public DataInputStream getAnoLancamento() {
        return ano;
    }

    public void setAnoLancamento(DataInputStream anoLancamento) {
        this.ano = anoLancamento;
    }

    public void ligarCarro(){
        System.out.println("Ligando carro!");
    }
}


