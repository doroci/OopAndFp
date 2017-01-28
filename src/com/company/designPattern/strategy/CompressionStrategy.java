package com.company.designPattern.strategy;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by lee on 2017. 1. 29..
 */
public interface CompressionStrategy {
    OutputStream compress(OutputStream data) throws IOException;
}
