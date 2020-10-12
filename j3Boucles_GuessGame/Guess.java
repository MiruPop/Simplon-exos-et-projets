package j3Boucles_GuessGame;
import java.util.Scanner;

public class Guess
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		char maLettre = 'H';
		System.out.println("Je pense à une lettre entre A et Z. Peux-tu deviner laquelle c'est?");

			do {
				char lettreUtil = scanner.next().charAt(0);
				if (lettreUtil < 'A' || lettreUtil > 'Z')
					System.out.print("Il faut introduire une lettre majuscule");
				else if (lettreUtil == maLettre)
				{
					System.out.print("Bravo! Tu l'as trouvé!");
					break;
				}
				else if (lettreUtil < maLettre)
					System.out.print("Cherche plus haut!");
				else
					System.out.print("Cherche plus bas!");
		  }while (true);

		scanner.close();
	}
}
/* Je n'arrive pas à empêcher l'utilisation des séparateurs \n et \r...*/