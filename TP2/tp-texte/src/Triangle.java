
public class Triangle extends Forme {
	public Triangle(MachineTrace mt) {
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
		x = Math.cos(Math.toRadians(-30 + this.getTheta()))*hyp; // -30 so that -30+120 = 90 which is at the top of the circle. (it just looks better)
		y = Math.sin(Math.toRadians(-30 + this.getTheta()))*hyp;
		mt.placer(x,y);
		
		mt.baisser();
		
		for(int i = 1; i < 4; i++) {
			x = Math.cos(Math.toRadians(-30 + 120*i + this.getTheta()))*hyp;
			y = Math.sin(Math.toRadians(-30 + 120*i + this.getTheta()))*hyp;
			mt.placer(x,y);
		}
		mt.lever();
		
		/*
		mt.placer(-getTaille()/2,-getTaille()/2);
		mt.baisser();
		mt.placer(0,getTaille()/2);
		mt.placer(getTaille()/2,-getTaille()/2);
		mt.placer(-getTaille()/2,-getTaille()/2);
		mt.lever();
		*/
	}
}
