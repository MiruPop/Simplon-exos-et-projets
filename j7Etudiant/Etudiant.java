package j7Etudiant;

public class Etudiant
{
	private String nom;		//attribut priv� de type String nomm� nom
	
	public Etudiant (String nom)	//constructeur publique, 1 param�tre de type String, initialis. nom de l'�tudiant
	{
		this.nom = nom;
	}
	public void travailler ()			//m�thode 1
	{
			System.out.println(this.nom + " se met au travail !");
	}
	public void seReposer ()			//m�thode 2
	{
			System.out.println(this.nom + " se repose.");
	}
}