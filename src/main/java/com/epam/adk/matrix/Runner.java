package com.epam.adk.matrix;

import java.util.Random;

/**
 * Created by Kaikenov Adilhan on 30.09.2016.
 * The class with main method.
 *
 * @author Kaikenov Adilhan.
 */
public class Runner {

    /**
     * Application starting point.
     *
     * @param args input arguments array.
     */
    public static void main(String[] args) {

        // Creating matrices - initialized with random numbers (MULTIPLICATION)
        Matrix matrix1 = new Matrix(3, 3);
        Matrix matrix2 = new Matrix(3, 5);
        matrix1.initRandomly(10);
        matrix2.initRandomly(10);
        Matrix result1 = matrix1.multiply(matrix2);
        MatrixExpression expression1 = new MatrixExpression(new Matrix[]{matrix1, matrix2}, result1, Operation.MULTIPLICATION);

        System.out.println(expression1);

        System.out.println("----------------------------");

        // Creating matrix manually (TRANSPOSITION)
        Matrix matrix3 = new Matrix(new int[][]{{1, 3, 2}, {0, 4, -1}});
        Matrix result2 = matrix3.transpose();
        MatrixExpression expression2 = new MatrixExpression(new Matrix[]{matrix3}, result2, Operation.TRANSPOSITION);

        System.out.println(expression2);

    }

}