package com.company.dymrin10;

public class ArrayValueCalculator {


    public int doCalc(String[][] values) {

        checkArraySize(values);

        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                try {
                    sum += Integer.parseInt(values[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(String.format("Массив [%s][%s] не содержит аннализируемое число", i, j), ex);
                }
            }
        }

        return sum;
    }


    private void checkArraySize(String[][] values) {
        checkArraySize(values.length);

        for (int i = 0; i < values.length; i++) {
            checkArraySize(values[i].length);
        }
    }


    private void checkArraySize(int length) {
        if (length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4х4");
        }
    }
}
