package com.company;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!!!!");
    }

    public static void second(double a, double b, double c) {
        double summ = a * b * c;
        double aver = (a + b + c) / 3;
        System.out.println("Multiply: " + summ + " Average: " + aver + " Max: ");
        if (a > b) {
            if (a > c) {
                System.out.println(a + " " + Math.max(b, c) + " " + Math.min(b, c));
            } else {
                System.out.println(c + " " + Math.max(b, a) + " " + Math.min(b, a));
            }
        } else {
            if (b > c) {
                System.out.println(b + " " + Math.max(a, c) + " " + Math.min(a, c));
            } else {
                System.out.println(c + " " + Math.max(b, a) + " " + Math.min(b, a));
            }
        }
    }

    public static void third(int a, int b, int c) {
        int summ = a * b * c;
        double aver = (a + b + c) / 3d;
        System.out.println("Multiply: " + summ + " Average: " + aver + " Max: ");
        if (a > b) {
            if (a > c) {
                System.out.println(a + " " + Math.max(b, c) + " " + Math.min(b, c));
            } else {
                System.out.println(c + " " + Math.max(b, a) + " " + Math.min(b, a));
            }
        } else {
            if (b > c) {
                System.out.println(b + " " + Math.max(a, c) + " " + Math.min(a, c));
            } else {
                System.out.println(c + " " + Math.max(b, a) + " " + Math.min(b, a));
            }
        }
    }

    public static double[] fourth(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException(String.format("Wrong enter values"));
        }
        double discr = b * b - 4 * a * c;
        int root = -1;
        if (discr > 0) {
            root = 2;
        } else if (discr == 0) {
            root = 1;
        }
        if (root == 2) {
            double firstroot = ((-1) * b + Math.sqrt(discr)) / (2d * a);
            double secondroot = ((-1) * b - Math.sqrt(discr)) / (2d * a);
            System.out.println("First root: " + firstroot + " Second root: " + secondroot);
            return new double[]{firstroot, secondroot};
        }
        if (root == 1) {
            double firstroot = ((-1) * b) / (2d * a);
            System.out.println("The equation have only one root: " + firstroot);
            return new double[]{firstroot};
        }
        System.out.println("Only complex roots");
        return new double[]{};
    }

    public static void fifth(double a, double b, double step) {
        if (step <= 0 || a >= b) {
            throw new IllegalArgumentException(String.format("Wrong values"));
        }
        for (double i = a; i <= b; i += step) {
            i *= 100;
            i = Math.ceil(i) / 100;
            System.out.println("|x = " + i + "| |sin(x) = " + Math.sin(i) + " |");
        }
    }

    public static void sixth(double x1, double y1, double ans1, double x2, double y2, double ans2) {
        if ((x1 == 0 && y1 == 0 && ans1 != 0) || (x2 == 0 && y2 == 0 && ans2 != 0)) throw  new IllegalArgumentException(String.format("Wrong Values!"));
        if (x1/x2!=y1/y2){
            double delta = x1*y2-x2*y1;
            double deltax = ans1*y2 - ans2*y1;
            double deltay = ans2*x1 - ans1*x2;
            if (delta != 0) {
                System.out.println("The system has a single solution: ");
                double x = deltax/delta;
                double y = deltay/delta;
                System.out.println("x = " + x + "y = " + y);
            }
            if (deltax == 0 && deltay == 0){
                System.out.println("The system has an infinite number of solutions");
            }
            else{
                System.out.println("The system has no solutions");
            }
        }
        if (x1/x2 == y1/y2 && y1/y2 != ans1/ans2){
            System.out.println("The system has no solutions");
        }
        if (x1/x2 == y1/y2 && y1/y2 == ans1/ans2){
            System.out.println("The system has an infinite number of solutions");
        }
    }

    public static double seventh(double x, double esp) {
        double term = 1 + esp;
        double summ = 0;
        for (double n = 0; term > esp; n++) {
            summ += term = Math.pow(x, n) / factorial(n);
            term = Math.abs(term);
        }
        System.out.println("Σ = " + summ);
        return summ;
    }

    public static long factorial(double n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

