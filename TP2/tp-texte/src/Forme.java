
public abstract class Forme {
	private MachineTrace mt;
	private int taille;
	
	public Forme(MachineTrace mt) {
		this.mt = mt;
		this.taille = 100;
	}
	
	public void fixerPosition(int x, int y) {
		mt.placer((double) x, (double) y);
	}
	
	public void fixerTaille(int t) {
		this.taille = t;
	}
	
	public abstract void dessiner();
	
	public MachineTrace getMachineTrace(){
		return mt;
	}
	
	public int getTaille() {
		return taille;
	}
}
