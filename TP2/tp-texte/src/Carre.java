
public class Carre extends Forme {
	
	public Carre(MachineTrace mt) {
		super(mt);
	}

	@Override
	public void dessiner() {
		MachineTrace mt = getMachineTrace();
		mt.placer(-getTaille()/2,getTaille()/2);
		mt.baisser();
		mt.placer(-getTaille()/2,-getTaille()/2);
		mt.placer(getTaille()/2,-getTaille()/2);
		mt.placer(getTaille()/2,getTaille()/2);
		mt.placer(-getTaille()/2,getTaille()/2);
		mt.lever();
	}
}
