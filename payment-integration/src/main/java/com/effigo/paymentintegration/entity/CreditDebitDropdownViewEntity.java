package com.effigo.paymentintegration.entity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Data
@NoArgsConstructor
@Builder
@Table(name = "credit_debit_dropdown_view", schema = "upeg")
public class CreditDebitDropdownViewEntity {
    @Id
    @Column(name = "company_id")
    private String companyId;

    @Column(name = "company_name")
    private String companyName;

    public CreditDebitDropdownViewEntity(String companyId, String companyName) {
        this.companyId = companyId;
        this.companyName = companyName;
    }
}
