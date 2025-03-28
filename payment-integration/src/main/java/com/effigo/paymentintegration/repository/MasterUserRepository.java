package com.effigo.paymentintegration.repository;


import com.effigo.paymentintegration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface MasterUserRepository extends JpaRepository<User, String> {
	public Optional<User> findByUserNameIgnoreCaseOrEmailIgnoreCase(String username, String email);

	Optional<User> findByUserNameIgnoreCase(String userName);

	@Query(value = "select * from masters.master_user where manager = :Id", nativeQuery = true)
	public List<User> findByManagerId(String Id);

	Optional<User> findByVendorId(String vendorId);

	@Transactional
	@Modifying
	@Query(nativeQuery = true, value = " UPDATE supplier.master_user "
			+ " SET  user_name=:userName,  first_name=:firstName,  phone=:phone, mobile=:mobile, address=:address, designation=:designation "
			+ " WHERE  vendor_id=:vendorId")
	void updateUserBasicDetailsByVendorId(@Param("vendorId") String vendorId, @Param("userName") String userName,
			@Param("firstName") String firstName, @Param("phone") String phone, @Param("mobile") String mobile,
			@Param("address") String address, @Param("designation") String designation);

	@Transactional
	@Modifying
	@Query(nativeQuery = true, value = " UPDATE supplier.master_user SET  password=:password,force_change_password=:forceChangePwd "
			+ " WHERE  vendor_id=:vendorId")
	void updateUserPasswordByVendorId(@Param("vendorId") String vendorId, @Param("password") String password,
			@Param("forceChangePwd") Integer forceChangePwd);

	@Query(value = "select mu.manager from masters.master_user mu where user_id = :userId", nativeQuery = true)
	public String checkManager(@Param("userId") String userId);

	@Query(value = "select ishod from masters.master_user mu where user_id = :userId", nativeQuery = true)
	public boolean checkCentralizedUser(@Param("userId") String userId);



}
