class Lab_04_03_CreditCardInterest {
    public static void main(String[] args) {
        double creditCardBalance = 5000.0;
        double interestRate = 0.17; // 17%

        // Calculate interest after one month
        double interestOneMonth = creditCardBalance * interestRate;

        // Calculate interest after two months
        double interestTwoMonths = creditCardBalance * interestRate * 2;

        System.out.println("Credit Card Balance: $" + creditCardBalance);
        System.out.println("Interest after one month: $" + interestOneMonth);
        System.out.println("Interest after two months: $" + interestTwoMonths);
    }
}






