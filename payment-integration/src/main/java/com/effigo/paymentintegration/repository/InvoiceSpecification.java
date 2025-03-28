package com.effigo.paymentintegration.repository;

import com.effigo.paymentintegration.entity.InvoiceIntegrationView;
import com.effigo.paymentintegration.utils.SearchCriteria;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceSpecification implements Specification<InvoiceIntegrationView> {

	private SearchCriteria searchCriteria;
	@Override
	public Predicate toPredicate(Root<InvoiceIntegrationView> root, CriteriaQuery<?> query,
			CriteriaBuilder criteriaBuilder) {
		query.select(root.get("invoiceIntegrationId")).distinct(true);
			if(StringUtils.isNotBlank(searchCriteria.getKey()) && !searchCriteria.isCentralizedUser()) {
				if (root.get(searchCriteria.getKey()).getJavaType() == String.class) {
					return criteriaBuilder.like(
							root.get(searchCriteria.getKey()), "%" + searchCriteria.getValue() + "%");
				}
			}

		return null;
	}
}
