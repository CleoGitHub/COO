
public class Texte {
	private String texte;
	private int largeur;

	/**
	 * Construit un texte centré de largeur 80 à partir d'une chaîne de caractères.
	 * @param t La chaîne de caractères à centrer
	 */
	public Texte(String t) {
		texte = t;
		largeur = 80;
	}

	/**
	 * Change la largeur du texte centré.
	 * @param l Nouvelle largeur
	 */
	public void fixeLargeur(int l) {
		largeur = l;
	}
	
	public int getLargeur() {
		return largeur;
	}
	
	/**
	 * Renvoie la chaîne de caractères de ce texte non centrée.
	 * @return Texte non centré
	 */
	public String texte() {
		return texte;
	}

	/**
	 * Renvoie le texte centré : une chaîne de caractères avec suffisamment d'espaces
	 * à gauche pour que le texte soit centré par rapport à sa largeur
	 * @returns Le texte centré
	 */
	@Override
	public String toString() {
		return texte();
	}
}
