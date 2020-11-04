package org.jsprt.assignment.mapper;

import org.jsprt.assignment.domain.entity.Account;
import org.jsprt.assignment.domain.entity.Transaction;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ToDto {
    public org.jsprt.assignment.model.Account convert(Account account) {
        final var accountDto = new org.jsprt.assignment.model.Account();
        accountDto.setNumber(account.getNumber());
        accountDto.setName(account.getName());
        accountDto.setAvailableOpeningBalance(account.getOpeningBalance());
        accountDto.setCurrency(account.getCurrency());
        accountDto.setType(org.jsprt.assignment.model.Account.TypeEnum.fromValue(account.getType().name()));
        accountDto.setBalanceDate(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        return accountDto;
    }

    public org.jsprt.assignment.model.Transaction convert(Transaction transactionDomain) {
        final var transaction = new org.jsprt.assignment.model.Transaction();
        transaction.setName(transactionDomain.getName());
        transaction.setNumber(transactionDomain.getNumber());
        transaction.setCreditAmount(transactionDomain.getCreditAmount());
        transaction.setCurrency(transactionDomain.getCurrency());
        transaction.setTransactionNarrative(transactionDomain.getNarrative());
        transaction.setType(org.jsprt.assignment.model.Transaction.TypeEnum.fromValue(transactionDomain.getType().name()));
        transaction.setValueDate(new SimpleDateFormat("MMM. dd,yyyy ").format(new Date()));
        return transaction;
    }
}
