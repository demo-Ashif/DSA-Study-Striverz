package topics.maths;


public class BasicMaths {

    public static void main(String[] args) {
        countDigit(660);
    }

    static void countDigit(int n) {
        int count = 0;
        int div = n;

        while (n > 0) {
            int divisor = n % 10;
            if (divisor != 0) {
                if (div % divisor == 0) {
                    count++;
                }
            }

            n = n / 10;
        }

        System.out.print(count);
    }
}
