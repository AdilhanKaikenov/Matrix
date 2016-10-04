package com.epam.adk.matrix;

/**
 * Created by Kaikenov Adilhan on 3.10.2016.
 *
 * @author Kaikenov Adilhan.
 */
public class MatrixExpression {

    private static final int MAX_NUM_OF_MEMBER = 2;

    private Matrix[] operands;
    private Matrix result;
    private Operation operation;

    public MatrixExpression(Matrix[] operands, Matrix result, Operation operation) {

        if (operands.length <= MAX_NUM_OF_MEMBER) {
            this.operands = operands;
        } else {
            System.out.println("The number of members of the expression can not be more than two.");
            throw new IndexOutOfBoundsException();
        }

        this.result = result;
        this.operation = operation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < operands.length; i++) {
            sb.append("MATRIX №").append(i + 1).append("\n").append(operands[i]);
        }
        sb.append("RESULT (").append(operation).append("):\n").append(result);

        return sb.toString();
    }

}
