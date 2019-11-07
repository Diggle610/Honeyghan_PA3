public class Application {
    public static void main(String[] args){
        SavingsAccount saver1 = new SavingsAccount(2000.00f);

        SavingsAccount saver2 = new SavingsAccount(3000.00f);

        SavingsAccount.modifyInterestRate(4);

        System.out.println("Annual Interest rate = 4%");

        saver1.calculateMonthlyInterest();

        saver2.calculateMonthlyInterest();

        saver1.showSaving();

        saver2.showSaving();

        SavingsAccount.modifyInterestRate(5);

        System.out.println("Annual Interest rate = 5%");

        saver1.calculateMonthlyInterest();

        saver2.calculateMonthlyInterest();

        saver1.showSaving();

        saver2.showSaving();

    }
}
