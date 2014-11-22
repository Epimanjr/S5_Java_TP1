public class Exercice3 {

	/**
	 * Méthode principale
	 * 
	 * @param args les arguments
	 */
	public static void main(String[] args) {
		// Création de trois nombres flottants
		float x = (float)0.3;
		float y = (float)0.6;
		float z = (float)0.9;

		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);

		// Ecrit bonjour si troisième est égal à la somme des deux premiers
		if(z == (y + x)) {
			System.out.println("Bonjour");
		} else {
			System.out.println("PAS BONJOUR !");
		}
	}
}