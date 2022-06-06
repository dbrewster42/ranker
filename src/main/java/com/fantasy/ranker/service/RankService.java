package com.fantasy.ranker.service;

import com.fantasy.ranker.model.Hitting;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankService {
    List<Hitting> hitting;

    public void rankHitting(List<Hitting> allHitting){
        this.hitting = allHitting;
        hitting.sort((a, b) -> a.getRuns() - b.getHomeRuns());

    }

    public void getMedian(){

    }

    public void rankEachColumn(){

    }
}
