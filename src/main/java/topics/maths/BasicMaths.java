package topics.maths;


public class BasicMaths {

    public static void main(String[] args) {
        System.out.println(armstrongNumber(1));
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

    static boolean armstrongNumber(int n){
        int sum =0;
        int temp = n;

        while (temp>0){
            int digit = temp%10;
            sum = sum+ (digit*digit*digit);
            temp= temp/10;
        }

        return (sum == n);
    }
}
