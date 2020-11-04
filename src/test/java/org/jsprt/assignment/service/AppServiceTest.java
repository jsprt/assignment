package org.jsprt.assignment.service;

import org.jsprt.assignment.dao.Repository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static java.util.Arrays.asList;
import static org.jsprt.assignment.TestFixture.getAccount;
import static org.jsprt.assignment.TestFixture.getTransaction;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AppServiceTest {

    @Mock
    private Repository repository;

    @InjectMocks
    private AppService appService;

    @Test
    void verifyAccountRetrieval() {
        //Given
        String acc1 = "32423";
        String acc2 = "42423";
        String custId = "23423";
        when(repository.getAccounts(custId)).thenReturn(asList(getAccount(acc1), getAccount(acc2)));

        //When
        final var accounts = repository.getAccounts(custId);

        //Then
        accounts.stream().forEach(s -> Assertions.assertNotNull(s));
    }

    @Test
    void verifyTransactionRetrieval() {
        //Given
        String acc = "32423";
        String custId = "23423";
        when(repository.getTransactions(custId, acc)).thenReturn(asList(getTransaction(acc), getTransaction(acc)));

        //When
        final var transactions = repository.getTransactions(custId, acc);

        //Then
        transactions.stream().forEach(s -> Assertions.assertNotNull(s));
    }
}