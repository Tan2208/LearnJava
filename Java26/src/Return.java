public class Return {
    public static void main(String[] args) {

        //(2*1)->(2*5)
        //()
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                if(j>5)
                    return;
                System.out.print(i+ "*" + j + "=" + (i*j) + "\t");
            }
            System.out.println("\n");
        }
    }
}
