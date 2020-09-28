
public class Losange extends Forme {
	public Losange(MachineTrace mt) {
		super(mt);
	}

	@Override
	public void dessiner() {
		// TODO Auto-generated method stub
		MachineTrace mt = getMachineTrace();
		mt.placer(getTaille()/2,0);
		mt.baisser();
		mt.placer(0,getTaille()/2);
		mt.placer(-getTaille()/2,0);
		mt.placer(0,-getTaille()/2);
		mt.placer(getTaille()/2,0);
		mt.lever();

		// int pourcent = 3;

		// mt.placer(0,0);
		// mt.baisser();
		// mt.placer(getTaille()-getTaille()*pourcent/10,0);
		// mt.placer(getTaille(),getTaille());
		// mt.placer(getTaille()*pourcent/10,getTaille());
		// mt.placer(0,0);
		// mt.lever();
		
	}
}
