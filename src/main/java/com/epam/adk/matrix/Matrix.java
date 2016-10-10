package com.epam.adk.matrix;

import java.util.Random;

/**
 * Created by Kaikenov Adilhan on 30.09.2016.
 *
 * @author Kaikenov Adilhan.
 */
public class Matrix {

    private int[][] values;

    public Matrix(int rows, int columns) {
        values = new int[rows][columns];
    }

    public Matrix(int[][] matrix) {
        this.values = matrix;
    }

    /**
     * The method for filling a matrix with random numbers.
     *
     * @param range a random number in [-range - +range].
     */
    public void initRandomly(int range) {
        Random random = new Random();
        int rows = values.length;
        int columns = values[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                values[i][j] = (random.nextInt(range * 2 + 1) - range);
            }
        }
    }

    /**
     * The method returns an element of the matrix.
     *
     * @return values array.
     */
    public int get(int row, int column) {
        return values[row][column];
    }

    /**
     * The method returns number of the matrix rows.
     *
     * @return number of rows.
     */
    public int getRows() {
        return values.length;
    }

    /**
     * The method returns number of the matrix columns.
     *
     * @return number of rows.
     */
    public int getColumns() {
        return values[0].length;
    }

    /**
     * The method for multiplying two matrices.
     *
     * @param operand2 the second operand.
     * @return result Matrix.
     */
    public Matrix multiply(Matrix operand2) {

        if (operand2 == null) {
            throw new NullPointerException();
        }

        int m1Columns = values[0].length;
        int m1Rows = values.length;
        int m2Columns = operand2.getColumns();
        int m2Rows = operand2.getRows();

        int[][] result = new int[m1Rows][m2Columns];

        if (m1Columns == m2Rows) {

            for (int n = 0; n < m1Rows; n++) {
                for (int k = 0; k < m2Columns; k++) {
                    for (int m = 0; m < m1Columns; m++) {
                        result[n][k] += this.get(n, m) * operand2.get(m, k);
                    }
                }
            }
        } else {
            System.out.println("\nYou can multiply those matrices that have the same average index.\n");
        }
        return new Matrix(result);
    }

    /**
     * The method of matrix transposition.
     *
     * @return result Matrix.
     */
    public Matrix transpose() {

        if (values == null) {
            throw new NullPointerException();
        }

        int mRows = this.getRows();
        int mColumns = this.getColumns();

        int[][] result = new int[mColumns][mRows];

        for (int n = 0; n < mRows; n++) {
            for (int k = 0; k < mColumns; k++) {
                result[k][n] = this.get(n, k);
            }
        }
        return new Matrix(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            sb.append("{");
            for (int j = 0; j < values[0].length; j++) {
                sb.append(values[i][j]).append((j == values[0].length - 1) ? "" : "  ");
            }
            sb.append("}\n");
        }
        return sb.toString();
    }

}