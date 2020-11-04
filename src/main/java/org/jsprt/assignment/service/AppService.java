package org.jsprt.assignment.service;

import org.jsprt.assignment.dao.Repository;
import org.jsprt.assignment.mapper.ToDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class AppService {
    private final Repository repository;
    private final ToDto toDto;

    @Autowired
    public AppService(Repository repository) {
        this.repository = repository;
        this.toDto = new ToDto();
    }

    public List<org.jsprt.assignment.model.Account> retrieveAccounts(String customerId) {
        return repository.getAccounts(customerId).stream()
                .map(toDto::convert)
                .collect(toList());
    }

    public List<org.jsprt.assignment.model.Transaction> retrieveTransactions(String customerId, String accountId) {
        return repository.getTransactions(customerId, accountId).stream()
                .map(toDto::convert)
                .collect(toList());
    }
}
