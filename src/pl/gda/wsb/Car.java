package pl.gda.wsb;

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
    }

