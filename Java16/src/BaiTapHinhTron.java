import java.util.Scanner;

public class BaiTapHinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r;

        System.out.println("Nhap bán kính r= ");
        r = sc.nextDouble();

        double cv = r*2*Math.PI;
        System.out.println("Chu vi =" +cv);
        System.out.println("Chu vi =" +Math.round(cv));
        System.out.println("Chu vi =" +Math.round(cv*100.0)/100.0);

        double dt = Math.PI*Math.pow(r,2);
        System.out.println("Diện tích = "+dt);
        System.out.println("Diện tích =" +Math.round(dt*100.0)/100.0);
    }
}
