public class Main {
    public static void main(String[] args) {


        double creditBalance = 5000;
        double interestRate = 0.17;
        double updatedBalance;

        updatedBalance = creditBalance + (creditBalance * interestRate);
        System.out.println("The interest for first month is " + updatedBalance);
        updatedBalance = updatedBalance + (updatedBalance * interestRate);
        System.out.println("The interest for second month is " + updatedBalance);
     }
}