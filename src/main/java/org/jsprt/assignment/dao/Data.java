package org.jsprt.assignment.dao;

import org.jsprt.assignment.domain.entity.Account;
import org.jsprt.assignment.domain.entity.Transaction;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static org.jsprt.assignment.domain.entity.TransactionType.Credit;

public class Data {
    public static List<String> accounts = asList("11111111111", "22222222222", "33333333333");

    /**
     *
     * @param customerId Not used
     * @param account Not used
     * @return
     */
    public static List<Transaction> transactions(String customerId, String account) {
        return IntStream.range(0, 10)
                .mapToObj(value -> Transaction.builder()
                        .number(account)
                        .creditAmount(new Random().nextDouble() + "")
                        .date(new Date())
                        .type(Credit)
                        .narrative("Periodic Transfer")
                        .name("Current Account")
                        .build())
                .collect(toList());
    }

    /**
     *
     * @param customerId Not Used
     * @return
     */
    public static List<Account> accounts(String customerId) {
        return accounts.stream()
                .map(s -> Account.builder()
                        .number(s)
                        .currency("SGD")
                        .name("AC-" + s.substring(9))
                        .openingBalance(new Random().nextDouble() + "")
                        .build()
                ).collect(toList());
    }
}