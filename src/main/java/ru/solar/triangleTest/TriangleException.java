package ru.solar.triangleTest;

public class TriangleException {
    public static void main(String[] args) {
        var a = 6;
        var b = 5;
        var c = 4;
        calculate(a, b, c);
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Negative side length");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Not the equality of a triangle");
        }
        else {
            var z = a + b + c;

           System.out.println("A nice triangle");
        }
    }

    private static void calculate(int a, int b, int c) {
        divide(a, b, c);
    }

private static void divide(int a, int b, int c) {
    var z = a + b + c;
}
}











