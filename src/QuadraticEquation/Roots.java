package QuadraticEquation;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Roots {
    public double getDiscriminant(int a, int b, int c) {
        return pow(b, 2) - 4 * a * c;
    }

    public Roots() {
        Scanner in = new Scanner(System.in);

        System.out.println("Программа решает квадратное уровнение вида:\nax^2+bx+c\nВведите a,b,c: ");
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();

        int a = 2;
        int b = -9;
        int c = 4;

        double D = getDiscriminant(a, b, c);
        if (D > 0) {
            System.out.println("корень x1 = " + ((-b + sqrt(D)) / (2 * a)) + " корень x2 = " + ((-b - sqrt(D)) / (2 * a)));
        } else if (D == 0) {
            System.out.println("корень x1 = " + (double) -b / (2 * a) + " корень x2 = " + (double) -b / (2 * a));
        } else System.out.println("Корней для данного квадратного уровнения не существует");
    }

    public static void main(String[] args) {
        new Roots();
    }
}
