package br.com.dio.repeticoes;

public class ForEach {
    public static void main(String[] args) {
        String cantoras[]= {"MADONNA", "BEYONCE", "KALYE", "HAYLEY"};

        //Forma abreviada

        for(String cantora : cantoras){
            System.out.println("Nome da cantora é: " + cantora);
        }
    }
}
