
public class Losange extends Forme {
	public Losange(MachineTrace mt) {
		super(mt);
	}

	@Override
	public void dessiner() {
		MachineTrace mt = getMachineTrace();
		mt.placer(getTaille()/2,0);
		mt.baisser();
		mt.placer(0,getTaille()/2);
		mt.placer(-getTaille()/2,0);
		mt.placer(0,-getTaille()/2);
		mt.placer(getTaille()/2,0);
		mt.lever();
	}
}
