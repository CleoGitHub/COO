
public class TrianglePulsant extends FormePulsante {

	public TrianglePulsant(MachineTrace mt, int baseTaille, int etapesPulsations, int amplitude) {
		super(mt, baseTaille, etapesPulsations, amplitude);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void dessiner() {
		super.dessiner();
		MachineTrace mt = getMachineTrace();
		mt.placer(-getTaille()/2,-getTaille()/2);
		mt.baisser();
		mt.placer(0,getTaille()/2);
		mt.placer(getTaille()/2,-getTaille()/2);
		mt.placer(-getTaille()/2,-getTaille()/2);
		mt.lever();
	}

}
