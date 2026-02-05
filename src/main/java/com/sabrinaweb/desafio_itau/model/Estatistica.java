package com.sabrinaweb.desafio_itau.model;

import java.util.DoubleSummaryStatistics;
import java.util.Optional;

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

        if (String.valueOf(summaryStatistics.getMin()).contains("-Infi") || String.valueOf(summaryStatistics.getMin()).contains("Infi")){
            this.min = 0.0;
        }else {
            this.min = summaryStatistics.getMin();
        }
        if (String.valueOf(summaryStatistics.getMax()).contains("-Infi") || String.valueOf(summaryStatistics.getMax()).contains("Infi")){
            this.max = 0.0;
        }else {
            this.max = summaryStatistics.getMax();
        }
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
