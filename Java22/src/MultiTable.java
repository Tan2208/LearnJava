public class MultiTable {
    public static void main(String[] args) {

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i+ "*" + j + "=" + (i*j) + "\t");
            }
            System.out.println("\n");
        }

    }
}
