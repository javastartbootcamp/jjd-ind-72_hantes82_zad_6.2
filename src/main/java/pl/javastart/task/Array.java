package pl.javastart.task;

import java.util.Scanner;

public class Array {
    double[] arrDouble;

    public Array(int number) {
        arrDouble = new double[number];
    }

    public void fulfil() {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < arrDouble.length; i++) {
            System.out.println("Podaj liczbę zmiennoprzecinkowa na pozycji: " + i + " tabeli");
            arrDouble[i] = scn.nextDouble();
        }
    }

    public double print() {
        double result = 0;
        for (int i = 0; i < arrDouble.length; i++) {
            result += Math.pow(arrDouble[i], 2);
        }
        return result;
    }
}
