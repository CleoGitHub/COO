import java.util.Random;

/**
 * Programme de base fournit pour le TP, se référer au TP pour les détails.
 * @author Guillaume Huard
 */
public class FormesPulsantes {
	final static int nbFormes = 8;
	final static int nbObjets = 3;
	final static int etapesPulsations = 20;
	final static int amplitudePulsation = 20;
	final static int delai = 100;

	static Forme creerForme(int type, MachineTrace m) {
		switch (type) {
		case 0:
			return new CarrePulsant(m, 100, etapesPulsations, amplitudePulsation);
		case 1:
			return new Carre(m);
		case 2:
			return new TrianglePulsant(m, 100, etapesPulsations, amplitudePulsation);
		case 3:
			return new Triangle(m);
		case 4:
			return new LosangePulsant(m, 100, etapesPulsations, amplitudePulsation);
		case 5:
			return new Losange(m);
		case 6:
			return new CerclePulsant(m, 100, etapesPulsations, amplitudePulsation);
		case 7:
			return new Cercle(m);
		
		default:
			throw new RuntimeException("Forme Inconnue");
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
		}

		while (true) {
			for (int j = 0; j <= etapesPulsations; j++) {
				m.effacerTout();
				for (int i = 0; i < f.length; i++) {
					f[i].dessiner();
				}
				m.rafraichir();
				m.attendre(delai);
			}
		}
	}
}
