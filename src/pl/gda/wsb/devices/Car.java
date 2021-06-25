package pl.gda.wsb.devices;

import pl.gda.wsb.Producer;

public class Car extends Device {

        int wartosc;

        public Car(Producer producer, String model, int rok_produkcji, int wartosc) {
            super(producer,model,rok_produkcji);

            this.wartosc = wartosc;

        }

    public Producer getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getRok_produkcji() {
        return rok_produkcji;
    }

    public int getWartosc() {
        return wartosc;
    }

    @Override
    public void turnOn() {
        System.out.println("Car działa");
    }

    @Override
    public String  toString() {
        return "Car{" +
                "producer=" + producer +
                ", model='" + model + '\'' +
                ", rok_produkcji=" + rok_produkcji +
                ", wartosc=" + wartosc +
                '}';
    }


}

