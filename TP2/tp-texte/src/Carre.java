
public class Carre extends Forme{
	
	public Carre(MachineTrace mt) {
		super(mt);
	}

	@Override
	public void dessiner() {	
		super.dessiner();
		if(getTaille() == 0)
			return;
		
		MachineTrace mt = getMachineTrace();
		
		int hyp = (int) Math.sqrt(this.getTaille()/2*this.getTaille()/2*2);

		double x,y;
		x = Math.cos(Math.toRadians(45 + this.getTheta()))*hyp;
		y = Math.sin(Math.toRadians(45 + this.getTheta()))*hyp;
		mt.placer(x,y);
		
		mt.baisser();
		
		for(int i = 1; i < 5; i++) {
			x = Math.cos(Math.toRadians(45 + 90*i + this.getTheta()))*hyp;
			y = Math.sin(Math.toRadians(45 + 90*i + this.getTheta()))*hyp;
			mt.placer(x,y);
		}
		mt.lever();
	}
}
