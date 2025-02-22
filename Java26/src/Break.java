public class Break {
//    public static void main(String[] args) {
//
//        int i,j=0;
//
//        for (i = 0; i < 10; i++) {
//            for (j = 0; j < 20; j++) {
//                if(j>10)
//                    break;
//            }
//            System.out.println(i+","+j);
//        }
//        System.out.println(i+","+j);
//    }

    public static void main(String[] args) {

        int i,j=0;

        out: for (i = 0; i < 10; i++) {
            for (j = 0; j < 20; j++) {
                if(j>10)
                    break out;
            }
            System.out.println(i+","+j);
        }
        System.out.println(i+","+j);
    }
}
