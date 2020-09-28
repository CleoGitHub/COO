/**
 * Texte centré, typiquement un titre, mais peut s'appliquer à tout texte centré.
 * Le centrage est réalisé en ajoutant suffisamment d'espaces à gauche du texte.
 * 
 * @author Guillaume Huard
 */
public class TexteDroite extends Texte {
	public TexteDroite(String t) {
		super(t);
	}

	/**
	 * Renvoie le texte aligné à droite : une chaîne de caractères avec suffisamment d'espaces
	 * à gauche pour que le texte soit à droite par rapport à sa largeur
	 * @returns Le texte centré
	 */
	@Override
	public String toString() {
		int justification;
		StringBuilder resultat = new StringBuilder();

		justification = (getLargeur() - texte().length());
		for (int i = 0; i < justification; i++) {
			resultat.append(' ');
		}
		resultat.append(texte());
		return resultat.toString();
	}
}
