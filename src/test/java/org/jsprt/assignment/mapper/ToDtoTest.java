package org.jsprt.assignment.mapper;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.jsprt.assignment.TestFixture.getAccount;
import static org.jsprt.assignment.TestFixture.getTransaction;
import static org.junit.jupiter.api.Assertions.*;

class ToDtoTest {
    @Test
    void testAccountsConversion() {
        String testAccount = "11122233344";
        final var datePattern =
                Pattern.compile("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$");
        final var toDto = new ToDto();
        final var accountDomain = getAccount(testAccount);
        final var accountDto = toDto.convert(accountDomain);
        assertEquals(accountDomain.getNumber(), accountDto.getNumber());
        assertEquals(accountDomain.getName(), accountDto.getName());
        assertEquals(accountDomain.getOpeningBalance(), accountDto.getAvailableOpeningBalance());
        assertEquals(accountDomain.getCurrency(), accountDto.getCurrency());
        assertEquals(accountDomain.getType().name().toLowerCase(), accountDto.getType().name().toLowerCase());
        assertTrue(datePattern.matcher(accountDto.getBalanceDate()).find());
    }

    @Test
    void testTransactionsConversion() {
        String testAccount = "11122233344";
        final var toDto = new ToDto();
        final var transactionDomain = getTransaction(testAccount);
        final var transactionDto = toDto.convert(transactionDomain);
       assertEquals(transactionDomain.getName(), transactionDto.getName());
       assertEquals(transactionDomain.getNumber(), transactionDto.getNumber());
       assertEquals(transactionDomain.getCreditAmount(), transactionDto.getCreditAmount());
       assertEquals(transactionDomain.getNarrative(), transactionDto.getTransactionNarrative());
       assertEquals(transactionDomain.getType().name().toLowerCase(), transactionDto.getType().name().toLowerCase());
       assertNotNull(transactionDomain.getDate());
       assertEquals(transactionDomain.getCurrency(), transactionDto.getCurrency());
    }
}