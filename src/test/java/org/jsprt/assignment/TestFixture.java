package org.jsprt.assignment;

import org.jsprt.assignment.domain.entity.Account;
import org.jsprt.assignment.domain.entity.Transaction;

import java.util.Date;
import java.util.Random;

import static org.jsprt.assignment.domain.entity.AccountType.Savings;
import static org.jsprt.assignment.domain.entity.TransactionType.Credit;

public class TestFixture {

    public static Account getAccount(String number) {
        return Account.builder()
                .number(number)
                .name("test")
                .openingBalance(new Random().nextDouble() + "")
                .currency("INR")
                .type(Savings)
                .build();
    }

    public static Transaction getTransaction(String number) {
        return Transaction.builder()
                .number(number)
                .name("test")
                .creditAmount(new Random().nextDouble() + "")
                .type(Credit)
                .currency("GBP")
                .narrative("Periodic Payment")
                .date(new Date())
                .build();
    }
}
