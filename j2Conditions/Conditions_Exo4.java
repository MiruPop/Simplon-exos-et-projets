//algorithme qui demande à l’utilisateur de saisir trois valeurs et qui lui dit s’il s’y trouve un doublon

package j2Conditions;
import java.util.Scanner;

public class Conditions_Exo4
{
	public static void main(String[] args)
	{
		System.out.println("Veuillez saisir trois nombres entiers (appuyez sur Enter après chaque) :");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if ((a == b) || (b == c) || (a == c))
			System.out.println("Attention, il y a un doublon!");
		else
			System.out.println("Bon choix ! :)");
		scanner.close();
	}
}