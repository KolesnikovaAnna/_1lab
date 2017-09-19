package ru.spbstu.telematics.java;

import org.apache.commons.math3.linear.RealVector;

public class VectorMultiply {
    public static void main(String[] args) {

    }

    public static double vectorMult(RealVector v1, RealVector v2){
        return v1.dotProduct(v2);
    }
}
