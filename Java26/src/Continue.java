public class Continue {
//    public static void main(String[] args) {
//        int max = 100;
//        for (int i = 0; i < max; i++) {
//            if(i<90)
//                continue;
//            System.out.println(i);
//        }
//    }

    public static void main(String[] args) {


        loop: for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                if(i<5)
                    continue loop;
                System.out.print(i+ "*" + j + "=" + (i*j) + "\t");
            }
            System.out.println("\n");
        }
    }
}
