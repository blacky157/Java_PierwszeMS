package pl.gda.wsb.devices;

import pl.gda.wsb.Producer;
import pl.gda.wsb.salleable;

public abstract class  Device implements salleable {
    final Producer producer;
    final String model;
    final Integer rok_produkcji;

    public Device(Producer producer, String model, Integer rok_produkcji) {
        this.producer = producer;
        this.model = model;
        this.rok_produkcji = rok_produkcji;
    }

    public abstract void turnOn();

    @Override
    public String toString() {
        return "Device{" +
                "producer=" + producer +
                ", model='" + model + '\'' +
                ", rok_produkcji=" + rok_produkcji +
                '}';
    }
}
