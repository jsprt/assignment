package org.jsprt.assignment.domain.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {
    private String number;
    private String name;
    private String type;
    private String currency;
    private String openingBalance;
}
