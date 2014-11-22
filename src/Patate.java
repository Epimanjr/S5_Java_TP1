public class Patate {
	public String espece;
	public String datePlantation;
	private String dateRecolte;

	public Patate(String s0, String s1, String s2) {
		this.espece = s0;
		this.datePlantation = s1;
		this.dateRecolte = s2;
	}	

	public void decalerRecolte() {
		// Décalage
	}

	public static void main(String[] args) {
		Patate p = new Patate("", "", "");

		// Affichage des attributs publics
		System.out.println("Liste des attributs publics : ");
		System.out.println("------------------------------\n");
		for(Object f : p.getClass().getFields()) {
			System.out.println(f);
		}

		// Affichage des méthodes
		System.out.println("\n\nListe des méthodes : ");
		System.out.println("---------------------\n");
		for(Object f : p.getClass().getMethods()) {
			System.out.println(f);
		}
	}
}