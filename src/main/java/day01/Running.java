package day01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Running {

    private List<RunningData> data = new ArrayList<>();

    private void addData(String rowOfFile) {
        String[] tmp = rowOfFile.split(" km;");
        double km = Double.parseDouble(tmp[0]);
        LocalDate date = LocalDate.parse(tmp[1]);
        data.add(new RunningData(km, date));
    }

    public void loadFile(String filename) {
//        try (BufferedReader bf = new BufferedReader(new FileReader(path)) {
        try (BufferedReader bf = Files.newBufferedReader(Path.of(filename))) {
            bf.readLine();
            String line;
            while ((line = bf.readLine()) != null) {
                addData(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot reach file: " + filename, ioe);
        }
    }

    public double sumOfRunningInMonth(int year, int month) {
        double sum = 0.0;
        for (RunningData item : data) {
            if (item.getDate().getYear() == year && item.getDate().getMonth() == Month.of(month)) {
                sum += item.getKilometers();
            }
        }
        return sum;
    }

    public List<RunningData> getData() {
        return data;
    }
}
