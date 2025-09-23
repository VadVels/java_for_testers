public class hello {
    public static void main(String[] args) {
        calculate();
    }

    private static void calculate() {
        var a = 3;
        var b = -1;
        var c = 4;
        divide(a, b, c);
    }

    private static void divide(int a, int b, int c) {
        var z = a + b + c;
    }

}