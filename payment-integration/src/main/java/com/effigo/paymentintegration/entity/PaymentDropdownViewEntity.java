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
@Table(name = "payment_dropdown_view", schema = "upeg")
public class PaymentDropdownViewEntity {

    @Id
    @Column(name = "company_id")
    private String companyId;

    @Column(name = "company_name")
    private String companyName;

    public PaymentDropdownViewEntity(String companyId, String companyName) {
        this.companyId = companyId;
        this.companyName = companyName;
    }
}
