import java.util.Random;
import java.util.Scanner;

public class jogo {
    	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int numeroEscolhido = random.nextInt(100) + 1;
		int tentativasMaxi = 10;
		int tentativasResto = tentativasMaxi;
		boolean acertou = false;


		System.out.println("|-----------------------------------|");
		System.out.println("| Bem-vindo ao Jogo de Adivinhação! |");
		System.out.println("|-----------------------------------|");
		System.out.println("Eu escolhi um número de 1 até 100. Você tem " + tentativasMaxi + " tentativas para acertar.");


		while (tentativasResto > 0) {
			System.out.println("\nDigite seu palpite");
			int palpite = sc.nextInt();

			if (palpite == numeroEscolhido) {
				acertou = true;
				break;
			} else if (palpite < numeroEscolhido) {
				System.out.println("O número é maior que " + palpite);
			} else {
				System.out.println("O número é menor que " + palpite);
			}

			tentativasResto--;
		}

		if (acertou) {
			System.out.println("\n🎉 Parabéns! Você adivinhou o número " + numeroEscolhido + " com "
					+ (tentativasMaxi - tentativasResto) + " tentativa(s)!");
		} else {
			System.out.println(
					"\n😔 Que pena! Você não conseguiu adivinhar o número. O número era " + numeroEscolhido + ".");
		}
		sc.close();
	}
}