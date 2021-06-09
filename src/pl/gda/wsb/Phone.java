package pl.gda.wsb;

public class Phone {
String marka;
String model;
int rok_produkcji;

    public Phone(String marka, String model, int rok_produkcji) {
        this.marka = marka;
        this.model = model;
        this.rok_produkcji = rok_produkcji;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", rok_produkcji=" + rok_produkcji +
                '}';
    }
}
