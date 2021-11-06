package com.company.dymrin10;

public class Main {

    public static void main(String[] args) {
        ArrayValueCalculator calculator = new ArrayValueCalculator();


        System.out.println("Попытка один");
        System.out.println(tryArray(calculator, new String[][]{}));

        System.out.println("Попытка два");
        System.out.println(tryArray(calculator, new String[][]{{"123", "2"}}));

        System.out.println("Попытка три");
        System.out.println(tryArray(calculator, new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "A"},
                {"1", "2", "3", "4"},
        }));

        System.out.println("Попытка четыре");
        System.out.println(tryArray(calculator, new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        }));

    }

    static int tryArray(ArrayValueCalculator calculator, String[][] values) {
        try {
            return calculator.doCalc(values);
        } catch (MyArraySizeException ex) {
            ex.printStackTrace();
            System.out.println("Массив имеет неверно заданный размер. Проверьте массив");
        } catch (MyArrayDataException ex) {
            ex.printStackTrace();
            System.out.println("Массив имеет неверное значение. Проверьте массив");
        }
        return 0;
    }
}
