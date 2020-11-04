package org.jsprt.assignment.domain.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Account {
    private String name;
    private String number;
    private String currency;
    private AccountType type;
    private String openingBalance;
}
