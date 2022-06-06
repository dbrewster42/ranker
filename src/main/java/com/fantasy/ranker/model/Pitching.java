package com.fantasy.ranker.model;

import com.ebay.xcelite.annotations.Column;
import lombok.Data;

@Data
public class Pitching {
    @Column(name="Team Name")
    private final String name;
    @Column(name="W")
    private final int wins;
    @Column(name="K")
    private final int strikeouts;
    @Column(name="ERA")
    private final double era;
    @Column(name="WHIP")
    private final double whip;
    @Column(name="QS")
    private final int qualityStarts;
    @Column(name="NSV")
    private final int netSaves;

    public Pitching(Object[] arr) {
        name = (String) arr[0];
        Double dW = (Double) arr[1];
        wins = dW.intValue();
        Double dK = (Double) arr[2];
        strikeouts = dK.intValue();
        era = (double) arr[3];
        whip = (double) arr[4];
        Double dQ = (Double) arr[5];
        qualityStarts = dQ.intValue();
        Double dS = (Double) arr[6];
        netSaves = dS.intValue();
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getStrikeouts() {
        return strikeouts;
    }

    public double getEra() {
        return era;
    }

    public double getWhip() {
        return whip;
    }

    public int getQualityStarts() {
        return qualityStarts;
    }

    public int getNetSaves() {
        return netSaves;
    }
}
