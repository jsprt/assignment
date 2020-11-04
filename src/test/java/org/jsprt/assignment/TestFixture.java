package org.jsprt.assignment;

import org.jsprt.assignment.domain.entity.Account;

import java.util.Random;

import static org.jsprt.assignment.domain.entity.AccountType.Savings;

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
}

