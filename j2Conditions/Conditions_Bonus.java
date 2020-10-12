//Saisir les coefficients a et b et afficher la solution de l’équation ax + b = 0

package j2Conditions;
import java.util.Scanner;

public class Conditions_Bonus
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Soit l'équation ax + b = 0. Veuillez choisir la valeur de a et b :");
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.print("b = ");
		int b = scanner.nextInt();
		double xd = (double)-b / (double)a;
		if (a != 0)
		{
			System.out.println("x = "+xd);
		}
		else
			System.out.println("Impossible de diviser par 0");
		scanner.close();
	}
}