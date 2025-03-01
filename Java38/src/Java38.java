public class Java38 {
    public static void main(String[] args)
    {
        Date38 date1= new Date38(10,5,2025);
        Date38 date2= new Date38(5,10,2025);

        Nation na1 =  new Nation("01","VN");
        Nation na2 =  new Nation("02","USA");

        Producer38 prod1 =new Producer38("01",na1);
        Producer38 prod2 =new Producer38("02",na2);

        Computer cp1 = new Computer(prod1,date1,10000000,8);
        Computer cp2 = new Computer(prod2,date2,20000000,12);

        System.out.println("Computer 1 cheaper computer 2: "+cp1.checkPrice(cp2));

        System.out.println("Nation of computer 1: "+cp1.printNation());
        System.out.println("Nation of computer 2: "+cp2.printNation());
    }
}
