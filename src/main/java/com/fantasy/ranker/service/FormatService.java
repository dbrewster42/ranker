package com.fantasy.ranker.service;

import com.fantasy.ranker.model.Hitting;
import com.fantasy.ranker.model.Pitching;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FormatService {
    private final ExcelService excelService;

    public FormatService(ExcelService excelService) {
        this.excelService = excelService;
    }

    public List<Hitting> getHitting(){
        return excelService.readSheet("Sheet1").stream()
                .map(hitter -> new Hitting(hitter.toArray(new Object[7]))).collect(Collectors.toList());
    }

    public List<Pitching> getPitching(){
        return excelService.readSheet("Sheet2").stream()
                .map(hitter -> new Pitching(hitter.toArray(new Object[7]))).collect(Collectors.toList());
    }
}
