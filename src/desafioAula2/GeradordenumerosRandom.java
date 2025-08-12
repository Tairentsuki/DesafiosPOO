package desafios;
import java.util.Random;

public class GeradordenumerosRandom {
	public static void main(String[]args){
		Random random = new Random();
		int numeroAleatorio=random.nextInt(100)+1;
		System.out.println("Número aleatório: "+ numeroAleatorio);
	}
}
