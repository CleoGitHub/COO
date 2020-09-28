
public class FormePulsante extends Forme {
	
	private int etapesPulsations;
	private int currentPulsation = 0;
	private int baseTaille;
	private int amplitude;

	public FormePulsante(MachineTrace mt, int baseTaille, int etapesPulsations, int amplitude) {
		super(mt);
		this.baseTaille = baseTaille;
		this.etapesPulsations = etapesPulsations;
		this.amplitude = amplitude;
	}

	@Override
	public void dessiner() {
		fixerTaille(getBaseTaille() + (int) (getAmplitude() * (Math.sin(getCurrentPulsation() * 2 * Math.PI / getEtapesPulsations()) + 1) / 2));
		this.nextPulsation();
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

}
