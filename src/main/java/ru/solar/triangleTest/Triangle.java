package ru.solar.triangleTest;

public class Triangle {

    public double side1;
    public double side2;
    public double side3;


    public Triangle(double a, double b, double c) {
        calculateTriangle(a, b, c);
    }


    private void calculateTriangle(double a, double b, double c) {
        this.side1 = a;
        this.side2 = a;
        this.side3 = c;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return (Double.compare(side1, this.side1) == 0 && Double.compare(side2, this.side2) == 0 && Double.compare(side3, this.side3) == 0)
                || (Double.compare(side2,this.side1) == 0 && Double.compare(side2, this.side2) == 0 && Double.compare(side2, this.side3) == 0);





    }

    @Override
    public int hashCode() {
        return 1;
    }


    public static void printPerimeterTriangle(int a, int b, int c) {
        System.out.println("Периметр треугольника со сторонами" + a + +b + +c + " = " + PerimeterTriangle(a, b, c));
    }


    public static int PerimeterTriangle(int a, int b, int c) {
        return a + b + c;
    }

    public static void printHalfmeterTriangle(int a, int b, int c) {
        System.out.println("Полупериметр треугольника со сторонами" + a + +b + +c + " = " + HalfmeterTriangle(a, b, c));
    }

    public static int HalfmeterTriangle(int a, int b, int c) {
        return (a + b + c) / 2;
    }

    public static void printAreaTriangle(int a, int b, int c) {
        System.out.println("Площадь треугольника со сторонами" + a + +b + +c + " = " + AreaTriangle(a, b, c));
    }

    public static int AreaTriangle(int a, int b, int c) {
        return 6 * (6 - a) * (6 - b) * (6 - c);
    }
}

// Исключения треугольника
class TriangleException {
    public static void main(String[] args) {
        var a = 2;
        var b = 5;
        var c = 5;
        calculate(a, b, c);
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Negative side length");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Not the equality of a triangle");
        } else {
            var z = a + b + c;
            System.out.println("A nice triangle");
        }
    }


    public static void calculate(int a, int b, int c) {
        divide(a, b, c);
    }

    public static void divide(int a, int b, int c) {
        var z = a + b + c;
    }


}
