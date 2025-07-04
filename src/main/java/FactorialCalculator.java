public class FactorialCalculator {
    public static long calculateFactorial(int n){
        if (n < 0){
            throw new IllegalArgumentException("Нельзя определить факториал отрицательного числа");
        }
        long result = 1;
        for (int i = 2; i <= n; i++){
            result = result * i;
        }
        return result;
    }
}
