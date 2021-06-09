package pl.gda.wsb.devices;

import pl.gda.wsb.Producer;

public class Car {
        Producer producer;
        String model;
        int rok_produkcji;

        public Car(Producer producer, String model, int rok_produkcji) {
            this.producer = producer;
            this.model = model;
            this.rok_produkcji = rok_produkcji;

        }

        @Override
        public String toString() {
            return "Car{" +
                    "producer=" + producer +
                    ", model='" + model + '\'' +
                    ", rok_produkcji=" + rok_produkcji +
                    '}';
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
}

