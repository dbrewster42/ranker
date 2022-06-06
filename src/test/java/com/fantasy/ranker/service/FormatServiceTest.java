package com.fantasy.ranker.service;

import com.fantasy.ranker.model.Hitting;
import com.fantasy.ranker.model.Pitching;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FormatServiceTest {
    private FormatService sut = new FormatService(new ExcelService("stats.xlsx"));

    @Test
    void getHitting() {
        List<Hitting> hitting = sut.getHitting();

        assertThat(hitting).isNotNull();
        assertThat(hitting.size()).isEqualTo(14);
        Hitting hitter = hitting.get(0);
        assertThat(hitter.getAvg()).isNotNull();
        assertThat(hitter.getHomeRuns()).isNotNull();
        assertThat(hitter.getOps()).isNotNull();
        assertThat(hitter.getAvg()).isNotNull();

    }

    @Test
    void getPitching() {
        List<Pitching> pitching = sut.getPitching();

        assertThat(pitching).isNotNull();
        assertThat(pitching.size()).isEqualTo(14);
        Pitching pitcher = pitching.get(1);
        assertThat(pitcher.getEra()).isNotNull();
        assertThat(pitcher.getName()).isNotNull();
        assertThat(pitcher.getNetSaves()).isNotNull();
        assertThat(pitcher.getStrikeouts()).isNotNull();
    }
}