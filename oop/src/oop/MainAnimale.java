package oop;

public class MainAnimale {
    public static void main(String[] args) {
        Animale gatto1 = new Animale("roberto", 3, "miawww");
        Mammifero gatto2 = new Mammifero("roberto", 3, "miawww", "Pelo1");
        Animale gatto3 = new Mammifero("jonny", 3, "miawww", "Pelo1");

        System.out.println(gatto1.toString());
        System.out.println(gatto2.toString());
        System.out.println(gatto3.toString());
        gatto3.setVerso("miao miao");
        System.out.println(gatto3.getVerso());

    }
}
