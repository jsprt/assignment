package org.jsprt.assignment.domain.entity;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Builder
@Getter
public class Transaction {
    private Date date;
    private String name;
    private String number;
    private String currency;
    private String narrative;
    private String debitAmount;
    private String creditAmount;
    private TransactionType type;
}
