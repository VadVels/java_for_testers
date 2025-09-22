package ru.solar.geometry;

public class Triangle {
    public static void printPerimeterTriangle(int a, int b, int c) {
        System.out.println("Периметр треугольника со сторонами" + a +  + b +  + c +  " = " + PerimeterTriangle(a, b , c));
    }

    public static int PerimeterTriangle(int a, int b, int c) {
        return a + b + c;
    }

    public static void printHalfmeterTriangle(int a, int b, int c) {
        System.out.println("Полупериметр треугольника со сторонами" + a +  + b +  + c +  " = " + HalfmeterTriangle(a, b, c));
    }

    public static int HalfmeterTriangle(int a, int b, int c) {
        return (a + b + c) / 2;
    }

    public static void printAreaTriangle(int a, int b, int c) {
        System.out.println("Площадь треугольника со сторонами" + a +  + b +  + c + " = " + AreaTriangle(a, b, c));
    }

    public static int AreaTriangle(int a, int b, int c) {
        return  6 * (6 - a) * (6 - b) * (6 - c);
    }
}
