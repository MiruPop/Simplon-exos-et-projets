package j6Restau;
import java.util.Scanner;

public class restau
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String principal[] = {"poulet", "boeuf", "végétarien"};
		String accomp[] = {"légumes frais", "frites", "riz"};
		String boisson[] = {"eau plate", "eau gazeuze", "soda"};
		
		System.out.println("Notre restaurant vous propose 3 formules-midi à 9 euros:\n1. poulet\n2. boeuf\n3. légumes");
		System.out.println("Veuillez choisir votre menu: ");
		
		int choix;
		int acc;
		int boiss;
		
		choix = scanner.nextInt();
		if(choix == 1)
		{
			System.out.println("Choisissez un accompagnement:\n1. légumes frais\n2. frites\n3. riz");
			acc = scanner.nextInt();
			
			if (acc == 1)
			{
				System.out.println("Choisissez une boisson:\n1. eau plate \n2. eau gazeuze\n3. soda");
				boiss = scanner.nextInt();
				if (boiss == 1)
					System.out.println("Menu: "+principal[0]+"\naccompagnement: "+accomp[0]+"\nboisson: "+boisson[0]);
				if (boiss == 2)
					System.out.println("Menu: "+principal[0]+"\naccompagnement: "+accomp[0]+"\nboisson: "+boisson[1]);
				if (boiss == 3)
					System.out.println("Menu: "+principal[0]+"\naccompagnement: "+accomp[0]+"\nboisson: "+boisson[2]);
			}
			else if (acc == 2)
				{
				System.out.println("Choisissez une boisson:\n1. eau plate \n2. eau gazeuze\n3. soda");
				boiss = scanner.nextInt();
				if (boiss == 1)
					System.out.println("Menu: "+principal[0]+"\naccompagnement: "+accomp[1]+"\nboisson: "+boisson[0]);
				if (boiss == 2)
					System.out.println("Menu: "+principal[0]+"\naccompagnement: "+accomp[1]+"\nboisson: "+boisson[1]);
				if (boiss == 3)
					System.out.println("Menu: "+principal[0]+"\naccompagnement: "+accomp[1]+"\nboisson: "+boisson[2]);
				}
			else
				{
				System.out.println("Choisissez une boisson:\n1. eau plate \n2. eau gazeuze\n3. soda");
				boiss = scanner.nextInt();
				if (boiss == 1)
					System.out.println("Menu: "+principal[0]+"\naccompagnement: "+accomp[2]+"\nboisson: "+boisson[0]);
				if (boiss == 2)
					System.out.println("Menu: "+principal[0]+"\naccompagnement: "+accomp[2]+"\nboisson: "+boisson[1]);
				if (boiss == 3)
					System.out.println("Menu: "+principal[0]+"\naccompagnement: "+accomp[2]+"\nboisson: "+boisson[2]);
				}
			}

			if(choix == 2)
			{
				System.out.println("Attention! Le menu boeuf ne propose pas de boisson");
				System.out.println("Choisissez un accompagnement:\n1. légumes frais\n2. frites\n3. riz");
				acc = scanner.nextInt();
				if (acc == 1)
					System.out.println("Menu: "+principal[1]+"\naccompagnement: "+accomp[0]);
				else if (acc == 2)
					System.out.println("Menu: "+principal[1]+"\naccompagnement: "+accomp[1]);
				else
					System.out.println("Menu: "+principal[1]+"\naccompagnement: "+accomp[2]);
			}
			if(choix == 3)
			{
				System.out.println("Pour le menu légumes, vous pouvez avoir une portion supplémentaire de riz");
				System.out.println("Souhaitez-vous du riz? o/n");
				char riz = scanner.next().charAt(0);
				if (riz == 'o')
				{
					{
						System.out.println("Choisissez une boisson:\n1. eau plate \n2. eau gazeuze\n3. soda");
						boiss = scanner.nextInt();
						if (boiss == 1)
							System.out.println("Menu: "+principal[2]+"\naccompagnement: avec riz\nboisson: "+boisson[0]);
						if (boiss == 2)
							System.out.println("Menu: "+principal[2]+"\naccompagnement: avec riz\nboisson: "+boisson[1]);
						if (boiss == 3)
							System.out.println("Menu: "+principal[2]+"\naccompagnement: avec riz\nboisson: "+boisson[2]);
						}
				}
				else
				{
					System.out.println("Choisissez une boisson:\n1. eau plate \n2. eau gazeuze\n3. soda");
					boiss = scanner.nextInt();
					if (boiss == 1)
						System.out.println("Menu: "+principal[2]+"\naccompagnement: sans riz\nboisson: "+boisson[0]);
					if (boiss == 2)
						System.out.println("Menu: "+principal[2]+"\naccompagnement: sans riz\nboisson: "+boisson[1]);
					if (boiss == 3)
						System.out.println("Menu: "+principal[2]+"\naccompagnement: sans riz\nboisson: "+boisson[2]);
				}
			}
			System.out.println("Prix total de la commande : 9 euros\nMerci de régler votre commande en caisse");
		scanner.close();
	}
}