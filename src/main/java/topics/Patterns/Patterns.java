package topics.Patterns;

public class Patterns {
    //Rules
    /*
     * 1. Count Number of Rows
     * 2. For the inner loop, focus on the Column & connect them somehow to the rows
     * 3.
     * 4. Observe symmetry (Optional) */

    public static void main(String[] args) {

        pattern18_2(5);
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

    static void Pattern3(int n) {
        for (int row = 0; row < n; row++) {

            for (int col = 0; col <= row; col++) {
                System.out.print(col + 1 + " ");
            }
            System.out.println();
        }
    }

    static void Pattern4(int n) {
        for (int row = 0; row < n; row++) {

            for (int col = 0; col <= row; col++) {
                System.out.print(row + 1 + " ");
            }
            System.out.println();
        }
    }

    static void Pattern5(int n) {
        for (int i = n; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern6(int n) {
        for (int i = n; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }

    static void Pattern7(int n) {
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

    static void Pattern8(int n) {
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


    static void Pattern9(int n) {
        Pattern7(8);
        Pattern8(8);
    }

    static void Pattern10(int n) {
        Pattern2(n);
        Pattern5(n - 1);
    }

    static void Pattern11(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) start = 1;
            else start = 0;

            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
        }
    }


    static void Pattern12(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            //number
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            //space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            //number
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space = space - 2;


        }
    }

    static void pattern13(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {

            //space
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 1;

            }
            System.out.println();
        }
    }

    static void pattern14(int n) {

        for (int i = 0; i < n; i++) {

            for (char ch = 'A'; ch < 'A' + i + 1; ch++) {
                System.out.print((ch) + "");
            }
            System.out.println();
        }
    }

    static void pattern15(int n) {

        for (int i = n; i > 0; i--) {

            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print((ch) + "");
            }
            System.out.println();
        }
    }

    static void pattern16(int n) {

        for (int i = 0; i < n; i++) {

            char val = 'A';

            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print((char) (val + i) + "");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {

        for (int i = 1; i <= n; i++) {

            //space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //characters
            char val = 'A';
            for (int j = 1; j <= (2 * i) + 1; j++) {
                System.out.print(val);

                if (j <= (2 * i + 1) / 2)
                    val++;
                else val--;
            }

            //space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern18(int n) {

        char val = 'E';
        for (int i = 1; i <= n; i++) {

            //characters
            for (int j = 1; j <= i; j++) {
                System.out.print(val);
                val++;
            }

            val = (char) ('E' - i);

            System.out.println();
        }
    }

    static void pattern18_2(int n) {

        char val = (char) ('A' + n-1);
        for (int i = 1; i <= n; i++) {

            //characters
            for (int j = 1; j <= i; j++) {
                System.out.print(val);
                val--;
            }

            val = (char) ('A' + n-1);

            System.out.println();
        }
    }
}
