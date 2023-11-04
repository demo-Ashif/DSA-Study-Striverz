package topics.Patterns;

public class Patterns {

    public static void main(String[] args) {
        nStartTriangle(3);
    }

    static void Pattern1(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern2(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void PatternNTriangle(int n) {
        for (int row = 0; row < n; row++) {

            for (int col = 0; col <= row; col++) {
                System.out.print(col + 1 + " ");
            }
            System.out.println();
        }
    }

    static void PatternNTriangle2(int n) {
        for (int row = 0; row < n; row++) {

            for (int col = 0; col <= row; col++) {
                System.out.print(row + 1 + " ");
            }
            System.out.println();
        }
    }

    static void Seeding(int n) {
        for (int i = n; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Seeding2(int n) {
        for (int i = n; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }

    static void nStartTriangle(int n) {
        for (int row = 1; row <= n; row++) {

            //space
            for (int col = n-1; col >= row; col--) {
                System.out.print(" ");
            }

            //star
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }

            //space
            for (int col = n-1; col >= row; col--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void nStartTriangleRevers(int n) {
        for (int row = 1; row <= n; row++) {

            //space
            for (int col = n-1; col >= row; col--) {
                System.out.print(" ");
            }

            //star
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }

            //space
            for (int col = n-1; col >= row; col--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
