package main;

import java.util.*;

public class LuckyDraw {
    Set<String> boxcoupon =new HashSet<String>();
    public LuckyDraw(){

    }
    public boolean addCoupon(String x){
        return this.boxcoupon.add(x);
    }
    public boolean removeCoupon(String x){
        return this.boxcoupon.remove(x);
    }

    public boolean checkCoupon(String x){
        return this.boxcoupon.contains(x);
    }

    public void removeAllCoupon(){
        this.boxcoupon.clear();
    }
    public int getnumber(){
        return this.boxcoupon.size();
    }
    public String draw1coupon(){
        String rs = "";
        Random rd = new Random();
        int p = rd.nextInt(this.boxcoupon.size());
        rs=(String) this.boxcoupon.toArray()[p];
        return rs;
    }

    public void printfAll()
    {
        System.out.println(Arrays.toString(this.boxcoupon.toArray()));
    }

    public static void main(String[] args) {
        int sl=0;
        Scanner sc = new Scanner(System.in);
        LuckyDraw ld=new LuckyDraw();
        do {
            System.out.println("------------");
            System.out.println("MENU: \n" +
                    "1. Add id coupon.\n" +
                    "2. Delete id coupon.\n" +
                    "3. Check exist.\n" +
                    "4. Delete all.\n" +
                    "5. Number coupon.\n" +
                    "6. Draw coupon.\n" +
                    "7. Printf all coupon.\n"+
                    "0 Exit" );
            sl= sc.nextInt();
            sc.nextLine();
            if(sl==1||sl==2||sl==3)
            {
                System.out.println("Enter id coupon: ");
                String x = sc.nextLine();
                if(sl==1)
                    ld.addCoupon(x);
                else if(sl==2)
                    ld.removeCoupon(x);
                else
                    System.out.println("Coupon is exist: "+ld.checkCoupon(x));

            }
            else if (sl==4)
            {
                ld.removeAllCoupon();
            } else if (sl==5) {
                System.out.println("Number coupon is: "+ld.getnumber());
            } else if (sl==6) {
                System.out.println("Id lucky: "+ld.draw1coupon());
            } else if (sl==7) {
                System.out.println("All coupon: ");
                ld.printfAll();
            }
        }while (sl!=0);
    }
}
