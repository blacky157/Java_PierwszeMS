package pl.gda.wsb;

public class Animal {
    final String gatunek;
    String rodzina;
    String krolestwo;
    int wiek;
    private double weight;
    int waga;
    public static final Double domyslna_waga_psa = 20.0;
    public static final Double domyslna_waga_lwa = 60.0;
    public static final Double domyslna_waga = 1.0;

    public Animal(String gatunek, String rodzina, String krolestwo, int wiek, int waga) {
        this.gatunek = gatunek;
        this.rodzina = rodzina;
        this.krolestwo = krolestwo;
        this.wiek = wiek;
        this.waga = waga;

        if (gatunek.equals("lew")) {
            this.weight = domyslna_waga_lwa;
        } else if (gatunek.equals("pies")) {
            this.weight = domyslna_waga_psa;
        } else {
            this.weight = domyslna_waga;
        }
    }
    void feed(){
        if(weight <= 0){
            System.out.println(this.gatunek + " umarł z głodu");
        }
        else{
            weight ++;
            System.out.println(this.gatunek +" :pycha, dzięki !");
        }
    }
    void take_for_a_walk(){
        if(weight <= 0){
            System.out.println(this.gatunek + " umarł z głodu");
        }
        else{
            weight --;
            System.out.println(this.gatunek +" :było miło, dzięki");
        }
    }
}





