package com.effigo.paymentintegration.repository;

import com.effigo.paymentintegration.entity.MastersIntegrationPreferenceView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MastersIntegrationPreferenceViewRepository extends JpaRepository<MastersIntegrationPreferenceView,String> {


	@Query(value = " select * from masters.integration_preference where tenant_id =:tenantId ", nativeQuery = true)
	Optional<MastersIntegrationPreferenceView> findByTenantId(@Param("tenantId") String tenantId);
}
