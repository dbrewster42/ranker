package com.fantasy.ranker.service;

import com.fantasy.ranker.model.Hitting;
import com.fantasy.ranker.model.Pitching;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class ExcelServiceTest {
    private ExcelService sut = new ExcelService("stats.xlsx");

    @Test
    void readHitting() {
        Collection<Collection<Hitting>> hitters = sut.readHitting();
        for (Collection<Hitting> hitter : hitters){
            hitter.forEach(v -> System.out.println(v.toString()));
        }
        assertNotNull(hitters);
    }

    @Test
    void readPitching() {
        Collection<Collection<Pitching>> pitchers = sut.readPitching();
        assertNotNull(pitchers);
    }
}