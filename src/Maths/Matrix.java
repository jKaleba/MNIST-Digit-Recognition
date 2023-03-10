package Maths;

import java.util.Arrays;

public class Matrix {

    protected double[][] values;

    public Matrix(int depth, int width) {
        values = new double[depth][width];
    }

    public Matrix transpose() {
        Matrix result = new Matrix(values[0].length, values.length);
        for(int i = 0; i < values[0].length; i++) {
            for(int j = 0; j < values.length; j++) {
                result.set(i, j, values[j][i]);
            }
        }
        return result;
    }

    public int depth() {
        return values.length;
    }
    public int width() {
        return values[0].length;
    }

    public void set(int row, int column, double value) {
        this.values[row][column] = value;
    }
    public void set(int row, double[] value) {
        values[row] = value;
    }

    public double get(int row, int col) {
        return this.values[row][col];
    }

    public void fill(double value) {
        for(final double[] doubles : this.values) {
            Arrays.fill(doubles, value);
        }
    }
}