package gestione_parcheggio_veicoli;

public class Auto extends Veicolo {

	private int cilindrata;

	public Auto(String targa, String marca, int ore_sosta, int cilindrata) {
		super(targa, marca, ore_sosta);
		this.cilindrata = cilindrata;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	@Override
	public double calcolaTariffa() {
		double totale = ore_sosta * 2.50;
		if (cilindrata > 2000) {
			totale += 5.0;
		}
		return totale;
	}
}
