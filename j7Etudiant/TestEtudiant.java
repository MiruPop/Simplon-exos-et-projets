package j7Etudiant;

public class TestEtudiant
{

	public static void main(String[] args)
	{
		Etudiant stud1 = new Etudiant ("Toto");
		Etudiant stud2 = new Etudiant ("Titi");
		
		stud1.travailler();
		stud2.seReposer();
	}

}
