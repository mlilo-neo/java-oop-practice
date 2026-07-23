import java.util.Scanner;

public class Personal_Expense_Analyzer {

    public static void main(String[] args) {

        System.out.println("===== My Personal Monthly Expense Analyzer =====");

        Scanner input = new Scanner(System.in);

        // Using the for loop to repeat the program 3 times
        for (int month = 1; month < 4; month++) {

            System.out.println("\nAnalysis for Month " + month);

            // Variable declaration
            double monthlyAllowance;
            double familySupport;
            double foodExpense;
            double toiletriesExpense;
            double transportExpense;
            double fixedSaving;
            double otherExpense;
            double totalIncome;
            double totalExpense;

            System.out.print("Monthly Allowance: RM");
            monthlyAllowance = input.nextDouble();

            System.out.print("Family Support: RM");
            familySupport = input.nextDouble();

            System.out.print("Food Expense: RM");
            foodExpense = input.nextDouble();

            System.out.print("Toiletries Expense: RM");
            toiletriesExpense = input.nextDouble();

            System.out.print("Transport Expense: RM");
            transportExpense = input.nextDouble();

            System.out.print("Other Expense: RM");
            otherExpense = input.nextDouble();

            fixedSaving = 100;

            System.out.println("Fixed Saving: RM" + fixedSaving);

            totalIncome = monthlyAllowance + familySupport;

            totalExpense = foodExpense
                    + toiletriesExpense
                    + transportExpense
                    + otherExpense
                    + fixedSaving;

            // Calling the calculateAndDisplay method
            calculateAndDisplay(totalIncome, totalExpense);
        }

        input.close();
    }

    // Method to calculate and display the balance and saving percentage
    public static void calculateAndDisplay(double income, double expense) {

        double balance = income - expense;
        double savingPercentage = (balance / income) * 100;

        System.out.println("Total Income: RM" + income);
        System.out.println("Total Expense: RM" + expense);
        System.out.println("Remaining Balance: RM" + balance);

        // Calling the SavingStatus method
        SavingStatus(savingPercentage);
    }

    // Method using if-else to check saving status
    public static void SavingStatus(double savingPercentage) {

        if (savingPercentage >= 50) {
            System.out.println("Saving Status: Excellent");
        } else if (savingPercentage >= 30) {
            System.out.println("Saving Status: Good");
        } else if (savingPercentage >= 10) {
            System.out.println("Saving Status: Average");
        } else {
            System.out.println("Saving Status: Poor");
        }
    }
}
