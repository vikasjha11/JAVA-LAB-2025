import java.util.Scanner;
public class Interest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select type:");
        System.out.println("1:Term Deposit");
        System.out.println("2:Recurring Deposit");
        System.out.print("Enter the choice:");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("You Selected the Term Deposit");
                System.out.print("Enter the principal amount:");
                double p=sc.nextDouble();
                System.out.print("Enter the Rate:");
                double r=sc.nextDouble();
                System.out.print("ENter the Time:");
                int t=sc.nextInt();
                double a=p*Math.pow((1+r/100),t);
                System.out.println("THe total Amount Calculated is"+a);
                break;
                
            case 2:
                System.out.println("You Selected the Recurring Deposit");
                System.out.print("Enter the Monthly Installment: ");
                double m = sc.nextDouble();
                System.out.print("Enter the Rate: ");
                double rrd = sc.nextDouble();
                System.out.print("Enter the Time: ");
                int trd = sc.nextInt();
                double ard = m * ((Math.pow(1 + rrd / 100 / 12, 12 * trd) - 1) / (rrd / 100 / 12));
                System.out.println("The total Amount Calculated is: " + ard);
                break;
            default:
            System.out.println("Incorrect Input:");
        }
    }
}
