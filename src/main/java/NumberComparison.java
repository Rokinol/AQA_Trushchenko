public class NumberComparison {
    public static String compare(int a, int b) {
        if (a > b) {
            return a + " > " + b;
        } else if (a < b) {
            return a + " < " + b;
        } else {
            return a + " == " + b;
        }
    }
}
