package ereditarieta;

public class MotorinoImmatricolato extends Motorino{

		private float maxVelocita; //velocità massima
		private String targa; //targa
		
		//costruttore parametrizzato
		public MotorinoImmatricolato(String c, String t, float v, float mV, String tg) {
			super(c, t, v);
			this.maxVelocita = mV;
			this.targa = tg;
		}
		
		//get e set
		public String getTarga() {
			return this.targa;
		}
		
		public float getMaxVelocita() {
			return this.maxVelocita;
		}
		
		public void setTarga(String t) {
			this.targa = t;
		}
		
		public void setMaxVelocita(float mv) {
			this.maxVelocita = mv;
		}
		
		//metodo getMax
		public void getMax() {
			System.out.println("La velocità massima del motorino immatricolato è " + this.maxVelocita);
		}
		
		//metodo accellera 
		@Override
		public void accelera(float v) {
			float s = v + super.getVelocita(); //variabile temporanea
			
			if (s < this.maxVelocita)
				super.setVelocita(s);
			else
				super.setVelocita(this.maxVelocita);
		}
}
