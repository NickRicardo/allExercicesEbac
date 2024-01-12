package br.com.nicolasdev;


/**
 * @author nicolas.santos
 */
public class Exemplos {

    // REGIAO DE VARIAVEIS
    private int codigo = 1;

    private long codigoMAior = 29182711;

    private double valorDecimal1= 10.1;

    private String texto= "Nicolas Santos";

    private boolean status = false;

    private float valorDecimal = 10.0f;

    private short shor;

    private byte bi;


    //MÉTODOS BÁSICOS
    public int retornarCodigo(){
        this.codigo = 0;
        return  15;
    }

    public String retornarTexto(){
        return "oi oi oi";
    }

    public long retornarLong(long num){
        return num;
    };

    public int retornaInteiro(){
        int val = 10; //variavel escopo de metodo, só tenho acesso a esse metodo dentro desse escopo;
        return val;
    }

}
