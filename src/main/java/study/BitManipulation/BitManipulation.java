package study.BitManipulation;

public class BitManipulation {
    public static void main(String[] args) {
        oddEven(2);
        swap(5, 7);
    }

    private static void swap(int num1, int num2) {
        int a = num1;
        int b = num2;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.printf("after swap-a: %d, b:%d", a, b);

    }

    private static void oddEven(int num) {
        boolean value = (num & 1)==0;

        if(value) System.out.println("number is even");
        else System.out.println("number is odd");
    }
}
