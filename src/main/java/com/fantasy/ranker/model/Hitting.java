package com.fantasy.ranker.model;

import com.ebay.xcelite.annotations.Column;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
public class Hitting {
    @Column(name="Team Name")
    private final String name;
    @Column(name="R")
    private final int runs;
    @Column(name="HR")
    private final int homeRuns;
    @Column(name="RBI")
    private final int rbis;
    @Column(name="SB")
    private final int sbs;
    @Column(name="AVG")
    private final double avg;
    @Column(name="OPS")
    private final double ops;

    public Hitting(Object[] arr) {
        name = (String) arr[0];
        Double dRuns = (Double) arr[1];
        runs = dRuns.intValue();
        Double dHR = (Double) arr[2];
        Double dRBI = (Double) arr[3];
        Double dSB = (Double) arr[4];

        homeRuns = dHR.intValue();
        rbis = dRBI.intValue();
        sbs = dSB.intValue();
        avg = (double) arr[5];
        ops = (double) arr[6];
    }

    public String getName() {
        return name;
    }

    public int getRuns() {
        return runs;
    }

    public int getHomeRuns() {
        return homeRuns;
    }

    public int getRbis() {
        return rbis;
    }

    public int getSbs() {
        return sbs;
    }

    public double getAvg() {
        return avg;
    }

    public double getOps() {
        return ops;
    }
}
