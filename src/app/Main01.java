package app;

import java.util.Scanner;

public class Main01 {
    static double kilometers;
    static double action;
    private static final double COEFFICIENT = 0.62;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Converting kilometers to miles :");
        System.out.println("Kilometers :");
        kilometers = scanner.nextDouble();
        action = converts(kilometers);
        double output = output();
        System.out.printf("Converting : " + "%.2f", output);
    }

    private static double converts(double kilometers) {
        return kilometers * COEFFICIENT;
    }

    private static double output() {
        return action;
    }

}
