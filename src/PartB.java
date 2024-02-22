import java.util.Scanner;

class CreditPayment {

    private double unpaidBalance;
    private double monthlyPayment;
    private double totalPayments;
    private double monthlyInterest;

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public void setUnpaidBalance(double unpaidBalance) {
        this.unpaidBalance = unpaidBalance;
    }

    public void setMonthlyInterest(double monthlyInterest) {
        this.monthlyInterest = monthlyInterest;
    }

    public void balancePrinter() {
        int month = 0;
        while (unpaidBalance > 0) {
            unpaidBalance += unpaidBalance * 0.015 - monthlyPayment;
            totalPayments += monthlyPayment;
            month++;
            if (unpaidBalance < 0) {
                unpaidBalance = 0;
            }
            System.out.println("Month: " + month + " Balance: " + unpaidBalance + " total payments: " + totalPayments);
        }
        System.out.println("Total payments: " + totalPayments);
    }
}

public class PartB {
    public static void main(String[] args) {
        CreditPayment creditPayment = new CreditPayment();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the beginning balance: ");
        double balance = scan.nextDouble();
        creditPayment.setUnpaidBalance(balance);

        System.out.println("Enter the monthly interest: ");
        double interest = scan.nextDouble();
        creditPayment.setMonthlyInterest(interest);

        System.out.println("Enter the monthly payment: ");
        double monthlyPayment = scan.nextDouble();
        creditPayment.setMonthlyPayment(monthlyPayment);

        creditPayment.balancePrinter();
    }
}
