package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Java57 {
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double wallet = 10000000;

        Locale lc =new Locale("vi","VN");
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
        int sl =0;

        do {
            System.out.println("Select 1 to begin.");
            System.out.println("Select 0 to exit.");
            sl=sc.nextInt();

            if(sl==1)
            {
                System.out.println("-------Start---------");
                System.out.println("My Wallet: "+numf.format(wallet));
                double bet=0;

                do{
                    System.out.print("Bet: ");
                    bet = sc.nextDouble();
                }while (bet<=0||bet>wallet);


                int select1 =0;
                do {
                    System.out.println("Select 1 => over or 2 => under.");
                    select1 = sc.nextInt();
                }while (select1!=1 && select1!=2);


                Random rd1 =new Random();
                Random rd2 =new Random();
                Random rd3 =new Random();

                int dice1 = rd1.nextInt(5)+1;
                int dice2 = rd2.nextInt(5)+1;
                int dice3 = rd3.nextInt(5)+1;
                int total = dice1+dice2+dice3;

                System.out.println("Result: "+dice1+"-"+dice2+"-"+dice3);

                if(total==3||total==18)
                {
                    wallet-=bet;
                    System.out.println("Total: "+total+" Owner win all");
                    System.out.println("Wallet: "+numf.format(wallet));
                }else if (total>=4 && total<=10 )
                {
                    System.out.println("Total: "+total+" Under");
                    if (select1==2){
                        System.out.println("You win!!!");
                        wallet+=bet;
                        System.out.println("Wallet: "+numf.format(wallet));
                    }else {
                        System.out.println(" You lost!!!");
                        wallet-=bet;
                        System.out.println("Wallet: "+numf.format(wallet));
                    }

                }else if(total>=11 && total<=17)
                {
                    System.out.println("Total: "+total+" Over");
                    if (select1==1){
                        System.out.println("You win!!!");
                        wallet+=bet;
                        System.out.println("Wallet: "+numf.format(wallet));
                    }else {
                        System.out.println("You lost!!!");
                        wallet-=bet;
                        System.out.println("Wallet: "+numf.format(wallet));
                    }

                }


            }




        }while (sl!=0);


    }
}
