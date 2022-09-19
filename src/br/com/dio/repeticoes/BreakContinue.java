package br.com.dio.repeticoes;

public class BreakContinue {
    public static void main(String[] args) {
        for(int number = 1; number <=5; number++){
            if(number == 3)
                break;
                System.out.println("Usando break");
                System.out.println(number);
        }

        for (int numero = 1; numero <= 5; numero++){
            if(numero == 3)
                continue;
                System.out.println("Usando continue");
                System.out.println(numero);
        }
    }
}
