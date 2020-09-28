
public class ParagrapheDroite extends Paragraphe {
	@Override
	public String toString() {
		calculeLignes();
		StringBuilder resultat = new StringBuilder();
		for (int i=0; i<nbLignes(); i++) {
			// Add the correct number of spaces before writing the line
			// In order to align the lines to the right
			for(int j = 0; j < getLargeur() - getLignes()[i].length(); j++)
				resultat.append(' ');
			resultat.append(getLignes()[i] + '\n');
		}
		return resultat.toString();
	}
}
