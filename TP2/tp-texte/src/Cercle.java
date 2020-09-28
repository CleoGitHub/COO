
public class Cercle extends Forme {
	public Cercle(MachineTrace mt) {
		super(mt);
	}

	@Override
	public void dessiner() {	
		super.dessiner();
		double div = 1000;

		MachineTrace mt = getMachineTrace();
		mt.lever();
		mt.placer(getTaille()/2,0);
		mt.baisser();
		for(int i = 0; i < div; i++) {
			double x,y;
			x = Math.cos(Math.toRadians((360/div)*(i+1)))*getTaille()/2;
			y = Math.sin(Math.toRadians((360/div)*(i+1)))*getTaille()/2;
			mt.placer(x,y);
		}
		mt.lever();
	}
}
