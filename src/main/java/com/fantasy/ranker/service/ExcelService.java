package com.fantasy.ranker.service;

import com.ebay.xcelite.Xcelite;
import com.ebay.xcelite.reader.SheetReader;
import com.ebay.xcelite.sheet.XceliteSheet;
import com.fantasy.ranker.model.Hitting;
import com.fantasy.ranker.model.Pitching;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Collection;
import java.util.List;

@Service
public class ExcelService {
    private String inputFile;

    public ExcelService(@Value("${input.file}") String inputFile){
        this.inputFile = inputFile;
    }


    public Collection<Collection<Object>> readSheet(String sheetName) {
        Xcelite xcelite = new Xcelite(new File(inputFile));
        XceliteSheet sheet = xcelite.getSheet(sheetName);

        SheetReader<Collection<Object>> simpleReader = sheet.getSimpleReader();

        return simpleReader.read();
    }


    public Collection<Collection<Hitting>> readHitting() {
        Xcelite xcelite = new Xcelite(new File(inputFile));
        XceliteSheet sheet = xcelite.getSheet("Sheet1");

        SheetReader<Collection<Hitting>> simpleReader = sheet.getBeanReader(Hitting.class);
        return simpleReader.read();
    }

    public Collection<Collection<Pitching>> readPitching() {
        Xcelite xcelite = new Xcelite(new File(inputFile));
        XceliteSheet sheet = xcelite.getSheet("Sheet2");

        SheetReader<Collection<Pitching>> simpleReader = sheet.getBeanReader(Pitching.class);

        return simpleReader.read();
    }
}
