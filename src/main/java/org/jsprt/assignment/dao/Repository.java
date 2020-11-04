package org.jsprt.assignment.dao;

import org.jsprt.assignment.domain.entity.Account;
import org.jsprt.assignment.domain.entity.Transaction;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.jsprt.assignment.dao.Data.accounts;
import static org.jsprt.assignment.dao.Data.transactions;

@Component
public class Repository {

    public List<Account> getAccounts(String customerId) {
        return accounts(customerId);
    }

    public List<Transaction> getTransactions(String customerId, String accountId) {
        return transactions(customerId, accountId);
    }
}
