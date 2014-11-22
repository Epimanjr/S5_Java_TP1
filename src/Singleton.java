public class Singleton {

	/*
	 * Création d'une seule et unique instance
	 */
	private static Singleton instance = new Singleton();

	// On déclare le constructeur en private
	private Singleton() {

	}

	// factory
	public static Singleton getInstance() {
		return instance;
	}

	/**
	 * Méthode principale
	 *
	 * @param args Méthode principale
	 */
	public static void main(String[] args) {
		Singleton inst = getInstance();

		Singleton s = new Singleton();
        }
}