package org.jsprt.assignment.domain.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Transaction {
    private String number;
    private String name;
    private Date date;
    private String debitAmount;
    private String creditAmount;
    private TransactionType type;
    private String narrative;
}
