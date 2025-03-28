package com.effigo.paymentintegration.repository;

import com.effigo.paymentintegration.entity.UserOrganizationRelInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserOrganizationRelInfoRepository extends JpaRepository<UserOrganizationRelInfoEntity, String> {
	List<UserOrganizationRelInfoEntity> findByStatus(Integer status);
}
