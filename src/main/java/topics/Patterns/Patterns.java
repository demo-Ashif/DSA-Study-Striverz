package topics.Patterns;

public class Patterns {
    //Rules
    /*
     * 1. Count Number of Rows
     * 2. For the inner loop, focus on the Column & connect them somehow to the rows
     * 3.
     * 4. Observe symmetry (Optional) */

    public static void main(String[] args) {
        pattern13(5);
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

    static void pattern6(int n) {
        for (int row = 0; row < n; row++) {

            //space
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }

            //star
            for (int col = 0; col < 2 * row + 1; col++) {
                System.out.print("*");
            }

            //space
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 0; row < n; row++) {

            //space
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }

            //star
            for (int col = 0; col < 2 * (n - row) - 1; col++) {
                System.out.print("*");
            }

            //space
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern13(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {

            //space
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num += 1;
            }
            System.out.println();
        }
    }
}
