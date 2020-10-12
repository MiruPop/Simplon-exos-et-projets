//Ecrire un programme demandant a l’utilisateur de saisir une valeur numerique positive n et affichant toutes les valeurs n, n-1, …, 2, 1, 0

package j4Boucles;
import java.util.Scanner;

public class Boucles_Exo1
{
	public static void main(String[] args)
	{
		try(Scanner scanner = new Scanner (System.in))
				{
					System.out.println("Introduisez un nombre positif:");
					System.out.print("n = ");
					int n = scanner.nextInt();
					for (;n > 0;n--)
						System.out.print(n+", ");
					if (n == 0)
						System.out.print(n);
				}

	}
}