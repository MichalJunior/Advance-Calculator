package com.kruczala.michal.advancecalculator.statistic;

import com.kruczala.michal.exceptions.NoRepositoryException;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class RepositoryApplication {




    public String searchAll() throws IOException {
        String path = "D://Repositories/RepositoryAdvanceCalculator.mkr";
        Charset encoding = Charset.defaultCharset();
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
}