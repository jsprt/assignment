package org.jsprt.assignment.dao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class RepositoryTest {
    private static final String CUSTOMER_ID = "12345678910";
    private static final String ACCOUNT_ID = "11111111111";

    @Test
    void testGetAccounts() {
        final var repository = new Repository();
        assertNotNull(repository.getAccounts(CUSTOMER_ID));
    }

    @Test
    void testGetTransactions() {
        final var repository = new Repository();
        assertNotNull(repository.getTransactions(CUSTOMER_ID, ACCOUNT_ID));
    }

}