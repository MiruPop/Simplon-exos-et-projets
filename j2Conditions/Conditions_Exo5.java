//demander � l�utilisateur de saisir int a et b et un op�rateur char parmi +, -, *, /. Affichez le r�sultat de l�op�ration a op b.

package j2Conditions;
import java.util.Scanner;

public class Conditions_Exo5
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir deux nombres entiers :");
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.print("b = ");
		int b = scanner.nextInt();
		System.out.println("Choisissez une op�ration parmi: +, -, *, /");
		char op = scanner.next().charAt(0);
		
		if (op == '+')
			System.out.println("a + b = "+(a+b));
		else if (op == '-')
			System.out.println("a - b = "+(a-b));
		else if (op == '*')
			System.out.println("a * b = "+(a*b));
		else if (op == '/')
			System.out.println("a / b = "+(a/b));
		else
			System.out.println("Pas le bon op�rateur");
		scanner.close();
	}
}