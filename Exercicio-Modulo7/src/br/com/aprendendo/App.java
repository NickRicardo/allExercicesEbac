package br.com.aprendendo;

public class App {
    public static void main(String[] args) {

        Carro carro = new Carro(1, "Pálio", "Branco", 2012){
            @Override
            public void ligarCarro() {
                super.ligarCarro();
            }
        };
    }
}
