package com.epam.adk.matrix;

/**
 * Enum created by Kaikenov Adilhan on 1.10.2016.
 *
 * @author Kaikenov Adilhan.
 */
public enum Operation {

    MULTIPLICATION("X"), ADDITION("+"), SUBTRACTION("-"), TRANSPOSITION("*");

    private String designation;

    Operation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

}
