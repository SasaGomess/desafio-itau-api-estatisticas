package com.sabrinaweb.desafio_itau.model;

import java.util.DoubleSummaryStatistics;

public class Estatistica {
    private long count;
    private double sum;
    private double avg;
    private double min;
    private double max;

    public Estatistica(DoubleSummaryStatistics summaryStatistics) {
        this.count = summaryStatistics.getCount();
        this.sum = summaryStatistics.getSum();
        this.avg = summaryStatistics.getAverage();
        this.min = summaryStatistics.getMin();
        this.max = summaryStatistics.getMax();
    }

    public Estatistica() {
    }

    public long getCount() {
        return count;
    }

    public double getMax() {
        return max;
    }

    public double getSum() {
        return sum;
    }

    public double getAvg() {
        return avg;
    }

    public double getMin() {
        return min;
    }
}
