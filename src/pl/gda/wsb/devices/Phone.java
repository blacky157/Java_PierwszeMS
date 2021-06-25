package pl.gda.wsb.devices;

import pl.gda.wsb.Producer;

public class Phone extends Device {
String marka;

public Phone(String marka, String model, Integer rok_produkcji, Producer producer)  {
        super(producer, model, rok_produkcji);
        this.marka = marka;

    }

    @Override
    public void turnOn() {
        System.out.println("phone działa");
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
