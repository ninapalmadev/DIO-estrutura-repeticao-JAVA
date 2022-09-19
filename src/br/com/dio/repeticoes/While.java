package br.com.dio.repeticoes;

import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0){
            double valorDoce = valorAleatorio();

            if(valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("Doce valor: " + valorDoce + " Adicionado ao carrinho");
            mesada -= valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Gastou toda sua mesada");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
