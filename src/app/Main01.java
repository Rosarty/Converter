package app;

import java.util.Scanner;

public class Main01 {
    static double miles;
    static double action;
    private static final double COEFFICIENT  = 1.61;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Converting miles to kilometers :");
        System.out.println("Miles :");
        miles = scanner.nextDouble();
        action = converts(miles);
        double output = output();
        System.out.printf("Converting : " + "%.2f", output);
    }

    private static double converts(double miles) {
        return miles * COEFFICIENT;
    }

    private static double output() {
        return action;
    }

}
