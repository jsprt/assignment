package org.jsprt.assignment.domain.entity;

import lombok.Data;

@Data
public class Transaction {
    private String number;
    private String name;
    private String date;
    private String debitAmount;
    private String creditAmount;
    private TransactionType type;
    private String narrative;
}
