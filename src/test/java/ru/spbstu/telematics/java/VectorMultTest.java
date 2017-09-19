package ru.spbstu.telematics.java;

import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.junit.Test;

public class VectorMultTest {

    @Test
    public void Test1(){
        double[] vv1 = {1, 2, 3, 4};
        double[] vv2 = {4, 3, 2, 1};

        RealVector v1 = MatrixUtils.createRealVector(vv1);
        RealVector v2 = MatrixUtils.createRealVector(vv2);
        double result1 = VectorMultiply.vectorMult(v1,v2);
        System.out.println(result1);

        double result2 = 0;
        for(int i = 0; i < vv1.length; i++){
            result2 += (vv1[i]*vv2[i]);
        }
        System.out.println(result2);
        if(result1==result2) System.out.println("\nTest 1 OK");
        else System.out.println("\nTest 1 Failed");
    }

    @Test
    public void Test2(){
        double[] vv1 = {1.12345, 2.36646, 3.465468, 4.3545};
        double[] vv2 = {4.46436, 3.687865, 2.2123, 1.53433};

        RealVector v1 = MatrixUtils.createRealVector(vv1);
        RealVector v2 = MatrixUtils.createRealVector(vv2);
        double result1 = VectorMultiply.vectorMult(v1,v2);
        System.out.println(result1);

        double result2 = 0;
        for(int i = 0; i < vv1.length; i++){
            result2 += (vv1[i]*vv2[i]);
        }
        System.out.println(result2);
        if(result1==result2) System.out.println("\nTest 2 OK");
        else System.out.println("\nTest 2 Failed");
    }
}
