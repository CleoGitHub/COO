import java.util.Random;

/**
 * Programme de base fournit pour le TP, se référer au TP pour les détails.
 * @author Guillaume Huard
 */
public class FormesPulsantes {
	final static int nbFormes = 4;
	final static int nbObjets = 3;
	final static int nombreAnimations = 3;
	final static int delai = 100;

	static Forme creerForme(int type, MachineTrace m) {
		switch (type) {
		case 0:
			return new Carre(m);
		case 1:
			return new Triangle(m);
		case 2:
			return new Losange(m);
		case 3:
			return new Cercle(m);
		default:
			throw new RuntimeException("Forme Inconnue");
		}
	}
	
	static void addAnimations(Forme f, Boolean[] animations) {
		for(int i = 0; i < animations.length; i++) {
			if((animations[i])) {
				switch(i) {
					case 0:
						f.rotate();break;
					case 1:
						f.pulser();break;
					case 2:
						f.clignoter();break;
				}
			}
		}
	}

	public static void main(String[] args) {
		MachineTrace m;
		Forme[] f;
		Random r;

		m = new MachineTrace(400, 400);
		m.masquerPointeur();
		m.rafraichissementAutomatique(false);

		f = new Forme[nbObjets];
		r = new Random();
		for (int i = 0; i < f.length; i++) {
			f[i] = creerForme(r.nextInt(nbFormes), m);
			f[i].fixerPosition(r.nextInt(200) - 100, r.nextInt(200) - 100);
			f[i].fixerTaille(r.nextInt(100) + 5);
			Boolean[] animations = new Boolean[nombreAnimations];
			for(int j = 0; j < nombreAnimations; j++) {
				animations[j] = r.nextBoolean();
			}
			addAnimations(f[i], animations);
		}

		while (true) {
				m.effacerTout();
				for (int i = 0; i < f.length; i++) {
					f[i].dessiner();
				}
				m.rafraichir();
				m.attendre(delai);
		}
	}
}
