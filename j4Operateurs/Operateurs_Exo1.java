//Ecrire un programme pour d�montrer la priorit� et l�associativit� des op�rateurs

package j4Operateurs;
import java.util.Scanner;

public class Operateurs_Exo1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Attention � la priorit� des op�rations!");
		System.out.println("Soit l'op�ration b+a-a."+'\n'+"On peut aussi la noter (b+a)-a ou b+(a-a), le r�sultat est le m�me");
		System.out.println("Par contre b+a*a et (b+a)*a n'ont pas du tout le m�me r�sultat. Demonstration :");
		System.out.println("Choisissez des valeurs enti�res pour a et b :");
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.print("b = ");
		int b = scanner.nextInt();
		System.out.println("b + a * a = "+(b+a*a));
		System.out.println("(b + a) * a = "+((b+a)*a));
		scanner.close();
	}
}