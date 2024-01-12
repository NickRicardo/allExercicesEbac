package br.com.nicolasdev;

/**
 * @author nicolas.santos
 */
public class Operadores {

    public static void main(String args[]) {
    operacoesAritimeticas();
    operacoesAtribuicoes();
    operacoesIncrementoDecremento();
    operacoesRelacionais();
    operadoresLogicos();
    }

    public static void operacoesAritimeticas(){
        System.out.println("");
        System.out.println("**** Operadoções Aritiméticas ****");
        int num1 = 10;
        int num2 = 20;

        int num3 = num1 + num2;
        int num4 = num1 - num2;
        int num5 = num2 / num1;
        int num6 = num1 * num2;
        int num7 = (10 + 10)/2;

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println("**********************************");
        System.out.println("");
    }

    private static void operacoesAtribuicoes() {
        System.out.println("");
        System.out.println("**** Operadores de Atribuição ****");
        int numero1 = 10;
        int numero2 = 10;
        int numero3 = numero1 + numero2;
        System.out.println(numero3);

        numero3 += numero3;
        System.out.println(numero3);

        int numero4 = numero3 + 20;
        System.out.println(numero4);

        System.out.println("**********************************");
        System.out.println("");
    }

    public static void operacoesIncrementoDecremento(){
        System.out.println("");
        System.out.println("**** Operadores de Incremento e Decremento ****");

        int num1 = 10;
        System.out.println(num1);

        num1++;
        System.out.println(num1);

        num1--;
        System.out.println(num1);

        System.out.println("***********************************************");
        System.out.println("");
    }

    public static void operacoesRelacionais(){
        System.out.println("");
        System.out.println("**** Operações Relacionais ****");
        int num1 = 10;
        int num2 = 10;
        boolean isMaior = num1 > num2;
        boolean isDiferente = num1 != num2;
        boolean isIgual = num1 == num2;
        boolean isMenor = num1 < num2;
        boolean isMaiorOuIgual = num1 >= num2;


        System.out.println("É Maior? " + isMaior);
        System.out.println("É Diferente? " +isDiferente);
        System.out.println("É Igual? " +isIgual);
        System.out.println("É Menor? " +isMenor);
        System.out.println("É Maior ou igual? " + isMaiorOuIgual);


        System.out.println("*********************************");
        System.out.println("");
    }

    public static void operadoresLogicos(){
        System.out.println("");
        System.out.println("**** Operações Relacionais ****");

        int num1 = 10;
        int num2 = 10;

        //1..10
        boolean isDentro10 = num1 >= 1 && num1 <= 10; //executa se as duas forem verdadeiras
        boolean isDentro_10 = num1 >= 1 || num1 <= 10; //executa uma das duas, se a primeira for verdadeira ja executa de cara
        boolean isNot = num1 >= 1;

        System.out.println("Este número está entre 0 e 10? " + isDentro10);
        System.out.println("Este número está entre 0 e 10? " + isDentro_10);
        System.out.println("Is Not: " + !isNot);


        System.out.println("*********************************");
        System.out.println("");
    }

}
