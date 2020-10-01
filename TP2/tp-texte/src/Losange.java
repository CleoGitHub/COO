
public class Losange extends Forme {
	public Losange(MachineTrace mt) {
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
		x = Math.cos(Math.toRadians(0 + this.getTheta()))*hyp;
		y = Math.sin(Math.toRadians(0 + this.getTheta()))*hyp;
		mt.placer(x,y);
		
		mt.baisser();
		
		for(int i = 1; i < 5; i++) {
			x = Math.cos(Math.toRadians(0 + 90*i + this.getTheta()))*hyp;
			y = Math.sin(Math.toRadians(0 + 90*i + this.getTheta()))*hyp;
			mt.placer(x,y);
		}
		mt.lever();
		
		/*
		mt.placer(getTaille()/2,0);
		mt.baisser();
		mt.placer(0,getTaille()/2);
		mt.placer(-getTaille()/2,0);
		mt.placer(0,-getTaille()/2);
		mt.placer(getTaille()/2,0);
		mt.lever();
		*/
	}
}
