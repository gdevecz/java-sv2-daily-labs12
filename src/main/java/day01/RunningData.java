package day01;

import java.time.LocalDate;

public class RunningData {

    private double kilometers;

    private LocalDate date;

    public RunningData(double kilometers, LocalDate date) {
        this.kilometers = kilometers;
        this.date = date;
    }

    public double getKilometers() {
        return kilometers;
    }

    public LocalDate getDate() {
        return date;
    }


    @Override
    public String toString() {
        return "RunningData{" +
                "kilometers=" + kilometers +
                ", date=" + date +
                '}';
    }
}
