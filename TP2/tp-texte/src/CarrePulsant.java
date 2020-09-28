
public class CarrePulsant extends FormePulsante {

	public CarrePulsant(MachineTrace mt, int baseTaille, int etapesPulsations, int amplitude) {
		super(mt, baseTaille, etapesPulsations, amplitude);
	}

	@Override
	public void dessiner() {
		super.dessiner();
		MachineTrace mt = getMachineTrace();
		mt.placer(-getTaille()/2,getTaille()/2);
		mt.baisser();
		mt.placer(-getTaille()/2,-getTaille()/2);
		mt.placer(getTaille()/2,-getTaille()/2);
		mt.placer(getTaille()/2,getTaille()/2);
		mt.placer(-getTaille()/2,getTaille()/2);
		mt.lever();
	}
	
	

}
