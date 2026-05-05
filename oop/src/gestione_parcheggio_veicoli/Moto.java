package gestione_parcheggio_veicoli;

public class Moto extends Veicolo {

	private boolean haBauletto;

	public Moto(String targa, String marca, int oreSosta, boolean haBauletto) {
		super(targa, marca, oreSosta);
		this.haBauletto = haBauletto;
	}

	public boolean getHaBauletto() {
		return haBauletto;
	}

	@Override
	public double calcolaTariffa() {
		double totale = ore_sosta * 1.50;
		if (haBauletto) {
			totale += 1;
		}
		return totale;
	}

}
