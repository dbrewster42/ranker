package com.fantasy.ranker.controller;

import com.fantasy.ranker.model.Hitting;
import com.fantasy.ranker.model.Pitching;
import com.fantasy.ranker.service.FormatService;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class RankController {
    private final FormatService formatter;

    public RankController(FormatService formatter) {
        this.formatter = formatter;
    }

    public void run(){
        List<Hitting> hitting = formatter.getHitting();
        List<Pitching> pitching = formatter.getPitching();

    }
}
