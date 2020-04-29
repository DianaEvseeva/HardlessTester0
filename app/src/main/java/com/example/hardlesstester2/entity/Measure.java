package com.example.hardlesstester2.entity;

import java.util.Objects;

public class Measure {

    private String nameMeasurement;
    private int countSeries;


    public Measure(String nameMeasurement, int countSeries) {
        this.nameMeasurement = nameMeasurement;
        this.countSeries = countSeries;
    }

    public String getNameMeasurement() {
        return nameMeasurement;
    }

    public int getCountSeries() {
        return countSeries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measure measure = (Measure) o;
        return countSeries == measure.countSeries &&
                nameMeasurement.equals(measure.nameMeasurement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameMeasurement, countSeries);
    }
}
