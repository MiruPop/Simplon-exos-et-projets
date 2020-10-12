//Ecrire un programme pour démontrer la priorité et l’associativité des opérateurs

package j4Operateurs;
import java.util.Scanner;

public class Operateurs_Exo1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Attention à la priorité des opérations!");
		System.out.println("Soit l'opération b+a-a."+'\n'+"On peut aussi la noter (b+a)-a ou b+(a-a), le résultat est le même");
		System.out.println("Par contre b+a*a et (b+a)*a n'ont pas du tout le même résultat. Demonstration :");
		System.out.println("Choisissez des valeurs entières pour a et b :");
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.print("b = ");
		int b = scanner.nextInt();
		System.out.println("b + a * a = "+(b+a*a));
		System.out.println("(b + a) * a = "+((b+a)*a));
		scanner.close();
	}
}