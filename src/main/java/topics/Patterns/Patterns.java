package topics.Patterns;

public class Patterns {

    public static void main(String[] args) {
        Pattern1(3);
    }

    static void Pattern1(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
