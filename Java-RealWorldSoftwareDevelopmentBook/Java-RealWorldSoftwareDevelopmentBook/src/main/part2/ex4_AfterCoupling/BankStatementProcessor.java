package main.part2.ex4_AfterCoupling;


import java.time.Month;
import java.util.List;


// группировка операций вычисления в класс BankStatementProcessor
public class BankStatementProcessor {
    private final List<BankTransaction> bankTransactions;

    public BankStatementProcessor(final List<BankTransaction> bankTransactions) {
        this.bankTransactions = bankTransactions;
    }
    public double calculateTotalAmount() {
        double total = 0d;
        for (final BankTransaction bankTransaction: bankTransactions)
            total += bankTransaction.getAmount();
        return total;
    }

    public double calculateTotalInMonth(final Month month) {
        double total = 0d;
        for (final BankTransaction bankTransaction: bankTransactions)
            if (bankTransaction.getDate().getMonth() == month)
                total += bankTransaction.getAmount();
        return total;
    }

    public double calculateTotalForCategory(final String category) {
        double total = 0d;
        for (final BankTransaction bankTransaction: bankTransactions)
            if (bankTransaction.getDescription().equals(category))
                total += bankTransaction.getAmount();
        return total;
    }
}
