package com.company.designPattern.strategy;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by lee on 2017. 1. 29..
 */
public class Compressor {

    private final CompressionStrategy strategy;

    public Compressor(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void compress(Path inFile, File outFile) throws IOException {

        try (OutputStream outputStream = new FileOutputStream(outFile)) {
            Files.copy(inFile,strategy.compress(outputStream));
        }
    }
}
