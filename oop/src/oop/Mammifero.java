package oop;

public class Mammifero extends Animale{ //CLASSE FIGLIA
    String pelo;
    //Costruttore
    public Mammifero(String nome, int eta, String verso, String pelo){
        super(nome, eta, verso);
        this.pelo = pelo;
    }
    //metodi get
    public String getVerso(){
        return verso;
    }
    //metodi set
    public void setVerso(String verso){
        this.verso = verso;
    }
    //toString
    public String toString(){
        return "Animale: " + nome + ", Età: " + eta + ", Verso: " + verso + ", Pelo: " + pelo ;
    }

}