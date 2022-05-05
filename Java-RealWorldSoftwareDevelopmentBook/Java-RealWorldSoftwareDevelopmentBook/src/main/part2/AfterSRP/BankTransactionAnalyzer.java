package main.part2.AfterSRP;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;


public class BankTransactionAnalyzer {
    private static final String RESOURCES = "src/main/resources/";

    public static double calculateTotalAmount(final List<BankTransaction> bankTransactions) {
        double total = 0d;
        for (final BankTransaction bankTransaction: bankTransactions)
            total += bankTransaction.getAmount();
        return total;
    }

    public static List<BankTransaction> selectInMonth(final List<BankTransaction>
                                                              bankTransactions, final Month month) {
        final List<BankTransaction> bankTransactionsInMonth = new ArrayList<>();
        for (final BankTransaction bankTransaction: bankTransactions) {
            if (bankTransaction.getDate().getMonth() == month)
                bankTransactionsInMonth.add(bankTransaction);
        }
        return bankTransactionsInMonth;
    }
}
