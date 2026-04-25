package oop;

public class Auto extends Veicolo {
    private String modello;

    // costruttore
    public Auto(String marca, String modello) {
        super(marca);
        this.modello = modello;
    }

    public String mostraModello() {
        return this.modello;
    }
}
