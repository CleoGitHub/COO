
public abstract class Forme {
	private MachineTrace mt;
	private int taille;
	
	private int etapesAnimations = 20;
	private int currentEtape = 0;
	private int baseTaille = -1;
	
	private boolean pulsation = false;
	private int amplitude = 20;
	private boolean rotation = false;
	private int theta = 0;
	private  boolean clignotement = false;
	
	
	public Forme(MachineTrace mt) {
		this.mt = mt;
		this.taille = 100;
	}
	
	public void fixerPosition(int x, int y) {
		mt.placer((double) x, (double) y);
	}
	
	public void fixerTaille(int t) {
		this.taille = t;
		if(this.baseTaille == -1)
			this.baseTaille = t;		
	}
	
	public void dessiner() {
		if(this.pulsation) {
			fixerTaille(getBaseTaille() + (int) (getAmplitude() * (Math.sin(getCurrentEtape() * 2 * Math.PI / getEtapesAnimations()) + 1) / 2));
		}
		if(this.rotation) {
			this.setTheta((this.getTheta() + 360/this.getEtapesAnimations())%360);
		}
		if(this.clignotement) {
			if ((this.currentEtape % 2) == 0)
				fixerTaille(0);
		}
		if(this.isAnimated())
			this.nextEtape();
	}

	public MachineTrace getMachineTrace(){
		return mt;
	}
	
	public int getTaille() {
		return taille;
	}

	/**  ANIMATIONS **/
	
	public int getEtapesAnimations() {
		return etapesAnimations;
	}

	public int getCurrentEtape() {
		return currentEtape;
	}

	public void nextEtape() {
		this.currentEtape = (currentEtape + 1) % etapesAnimations;
	}
	
	public boolean isAnimated() {
		return this.pulsation || this.rotation || this.clignotement ;
	}
	
	/**  PULSATION **/
	
	public void pulser() {
		this.pulsation = !this.pulsation;
	}

	public int getAmplitude() {
		return amplitude;
	}

	public int getBaseTaille() {
		return baseTaille;
	}
	
	/**  ROTATION **/
	
	public void rotate() {
		this.rotation = !this.rotation;
	}

	public int getTheta() {
		return theta;
	}

	public void setTheta(int theta) {
		this.theta = theta;
	}
	
	/** CLIGNOTEMENT  **/
	
	public void clignoter() {
		this.clignotement = !this.clignotement;
	}
	
}
