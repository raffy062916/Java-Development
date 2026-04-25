package costanti;

public class es4 {

	//Utilizzare una costante all'interno di un metodo per eseguire un calcolo.
	public static final double pg = 3.141592653589793;

    public static double calcolaArea(double raggio) {
        return pg * raggio * raggio;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double raggio = 5.0;
        System.out.println("Area del cerchio: " + calcolaArea(raggio));
	}

}
