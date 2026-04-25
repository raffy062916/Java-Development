package oop;

public class MainVeicolo {

	public static void main(String[] args) {
        Auto bmv = new Auto("Fiat", "Panda");
        Moto ducati = new Moto("Ducati", 55);
        String marcaAuto, marcaMoto, modello;
        int cilindrata;
        
        marcaAuto = bmv.mostraMarca();
        modello = bmv.mostraModello();
        marcaMoto = ducati.mostraMarca();
        cilindrata = ducati.getCilindrata();
        
        System.out.println("Auto\nMarca: " + marcaAuto + " Modello: " + modello);
        System.out.println("Moto\nMarca: " + marcaMoto + " Cilindrata: " + cilindrata);
    }
}
