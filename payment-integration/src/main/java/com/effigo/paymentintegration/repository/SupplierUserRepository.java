package com.effigo.paymentintegration.repository;


import com.effigo.paymentintegration.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface SupplierUserRepository extends JpaRepository<Supplier, String> {

	Optional<Supplier> findByUserNameIgnoreCase(String username);

	Optional<Supplier> findById(String userId);

	@Query(value = "select isadmin  from supplier.master_user mu where user_id = :userId", nativeQuery = true)
	public boolean checkAdditionalUser(@Param("userId") String userId);

}
