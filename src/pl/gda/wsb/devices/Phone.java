package pl.gda.wsb.devices;

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

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getRok_produkcji() {
        return rok_produkcji;
    }

}
