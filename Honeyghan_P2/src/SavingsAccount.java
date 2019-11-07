public class SavingsAccount {
    private static float annualInterestRate;

    private float savingsBalance;

    private float monthlyInterest;

    public SavingsAccount(float savingsBalance){

        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest(){

        this.monthlyInterest = (savingsBalance * annualInterestRate) / 12;

        System.out.println("The next month interest will be: $" + this.monthlyInterest);
    }
    public static void modifyInterestRate(float interestRate){

        annualInterestRate = interestRate;
    }
    private void calculateSavings(){

        savingsBalance += this.monthlyInterest;
    }
    public void showSaving(){

        calculateSavings();

        System.out.println("New balance is: $" +savingsBalance);
    }
}
