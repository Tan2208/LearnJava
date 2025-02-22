import java.util.Scanner;

public class CheckDayOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,y;

        System.out.println("Enter the month: ");
        m = sc.nextInt();
        System.out.println("Enter the year: ");
        y = sc.nextInt();

        switch (m) {
            case 1:
                case 3:
                    case 5:
                        case 7:
                            case 8:
                                case 10:
                                    case 12:
                                        System.out.println("Have 31 day");
                                        break;

            case 4:
                case 6:
                    case 9:
                        case 11:
                            System.out.println("Have 30 day");
                            break;


            case 2:
                if(y%4==0 && y%100!=0 || y%400==0)
                    System.out.println("Have 29 day");
                else System.out.println("Have 28 day");
                break;
        default:
            System.out.println("Invalid month");
            break;
        }
    }
}
