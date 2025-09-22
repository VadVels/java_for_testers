public class Triangle {
    public static void main(String[] args) {
        printPerimeterTriangle(3,4,5);

        printHalfmeterTriangle(3,4,5);

        printAreaTriangle(3,4,5);

    }


    public static void printPerimeterTriangle(int a , int b , int c) {
        System.out.println("Периметр треугольника со сторонами" + a +  + b +  + c +  " = " + PerimeterTriangle(a, b, c));
    }

    private static int PerimeterTriangle(int a, int b, int c) {
        return a + b + c;
    }


    private static void printHalfmeterTriangle(int a, int b, int c) {
        System.out.println("Полупериметр треугольника со сторонами" + a +  + b +  + c +  " = " + HalfmeterTriangle(a, b, c));
    }

    private static int HalfmeterTriangle(int a, int b, int c) {
        return (a + b + c) / 2;
    }


    private static void printAreaTriangle(int a, int b, int c) {
        System.out.println("Площадь треугольника со сторонами" + a +  + b +  + c + " = " + AreaTriangle(a, b, c));
    }

    private static int AreaTriangle(int a, int b, int c) {
        return  6 * (6 - a) * (6 - b) * (6 - c);
    }

}




