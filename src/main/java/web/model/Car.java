package web.model;

import java.time.LocalDate;

public class Car {

    private String model;

    private int series;

    private LocalDate produced;

    public Car(String model, int series, LocalDate produced) {
        this.model = model;
        this.series = series;
        this.produced = produced;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public LocalDate getProduced() {
        return produced;
    }

    public void setProduced(LocalDate produced) {
        this.produced = produced;
    }
}