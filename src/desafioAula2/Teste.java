package desafioAula2;

import java.util.Random;

public class Teste {
    public static void main(String[] args) {
        Random random = new Random();

        int qnt = 10;
        int min = 10;
        int max = 100;

        int numeroAleatorio = 0;

        for (int contador = min; contador <= qnt ; contador++){
            numeroAleatorio = random.nextInt(min, max) + 1;
            System.out.println("Número aleatório: " + numeroAleatorio);
        }


        System.out.println(numeroAleatorio);
    }
}