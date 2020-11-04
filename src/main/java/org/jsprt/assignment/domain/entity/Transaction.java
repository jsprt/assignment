package org.jsprt.assignment.domain.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
public class Transaction {
    private Date date;
    private String name;
    private String number;
    private String narrative;
    private String debitAmount;
    private String creditAmount;
    private TransactionType type;
}
