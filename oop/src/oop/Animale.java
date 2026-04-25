package oop;

public class Animale { //CLASSE PADRE
    String nome;
    int eta;
    String verso;

    //costruttore
    public Animale(String nome, int eta, String verso){
        this.nome = nome;
        this.eta = eta;
        this.verso = verso;
    }
    //get
    public String getVerso(){
        return verso;
    }
    //set
    public void setVerso(String verso){
        this.verso = verso;
    }
    //toString
    public String toString(){
        return "Animale: " + nome + ", Età: " + eta + ", Verso: " + verso;
    }
}
