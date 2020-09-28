
public abstract class Forme {
	private MachineTrace mt;
	private int taille;
	
	private int etapesPulsations;
	private int currentPulsation = 0;
	private int baseTaille = -1;
	private int amplitude;
	
	private boolean pulsation = false;
	
	private int theta = 0;
	
	private boolean rotation = false;
	
	
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
			fixerTaille(getBaseTaille() + (int) (getAmplitude() * (Math.sin(getCurrentPulsation() * 2 * Math.PI / getEtapesPulsations()) + 1) / 2));
		}
		if(this.rotation) {
			this.setTheta((this.getTheta() + 360/this.getEtapesPulsations())%360);
		}
		if(this.getAnimation())
			this.nextPulsation();
	}
	
	public boolean getAnimation() {
		return this.pulsation || this.rotation;
	}
	
	/**  PULSATION **/
	
	public void pulser() {
		this.pulsation = !this.pulsation;
	}
		
	public void setPulsation( int etapesPulsations, int amplitude) {
		this.etapesPulsations = etapesPulsations;
		this.amplitude = amplitude;
	}
	
	public MachineTrace getMachineTrace(){
		return mt;
	}
	
	public int getTaille() {
		return taille;
	}
	
	public int getEtapesPulsations() {
		return etapesPulsations;
	}
	
	public int getAmplitude() {
		return amplitude;
	}

	public int getCurrentPulsation() {
		return currentPulsation;
	}

	public void nextPulsation() {
		this.currentPulsation = (currentPulsation + 1) % etapesPulsations;
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
	
}
