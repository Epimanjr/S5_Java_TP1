/**
 * @author Maxime BLAISE
 * @version 1.0
 */
public class PassageParVal {

	/**
	 * Méthode principale.
	 *
	 * @param args Les arguments du programme
	 */
	public static void main(String[] args) {
		// Création d'une constante double
		final double val = 5.0;

		// Affichage
		System.out.println("Valeur initiale : " + val);

		// Division
		double nouvelleVal = diviser(val);
	}

	/**
	 * Méthode diviser, qui divise la valeur par deux, l'affiche et la retourne
	 * 
	 * @param valeur la valeur à diviser
	 * @return la valeur finale divisée par deux
	 */
	public static double diviser(double valeur) {
		double res = valeur /= 2;
		System.out.println("Valeur après division : " + res);
		return res;
	}
}