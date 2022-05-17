package part2.ex3_AfterCohesion;

import java.time.LocalDate;

// пример информационной связности
public class BankTransactionDAO {
    public BankTransaction create(final LocalDate date, final Double amount, final String description) {
        // ...
        throw new UnsupportedOperationException();
    }

    public BankTransaction read(final long id) {
        // ...
        throw new UnsupportedOperationException();
    }

    public BankTransaction update(final long id) {
        // ...
        throw new UnsupportedOperationException();
    }

    public void delete(final BankTransaction bankTransaction) {
        // ...
        throw new UnsupportedOperationException();
    }
}
