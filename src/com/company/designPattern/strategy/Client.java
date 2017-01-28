package com.company.designPattern.strategy;

import javax.annotation.processing.FilerException;
import java.io.*;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipOutputStream;

/**
 * Created by lee on 2017. 1. 29..
 */
public class Client {


    public static void main(String[] args) throws IOException {

        Path inGzipFile = Paths.get("/tmp/inFile/gzip_File");
        Path inZipFile = Paths.get("/tmp/inFile/zip_File");
        File outGzipFile = new File("/tmp/outFile/gzip.File");
        File outZipFile = new File("/tmp/outFile/zip.File");

        Compressor gzipCompressor = new Compressor(GZIPOutputStream::new);
//        Compressor gzipCompressor = new Compressor(new GzipCompressionStrategy());

        gzipCompressor.compress(inGzipFile, outGzipFile);

        Compressor zipCompressor = new Compressor(ZipOutputStream::new);
//        Compressor zipCompressor = new Compressor(new ZipCompressionStrategy());
        zipCompressor.compress(inZipFile, outZipFile);

    }
}
