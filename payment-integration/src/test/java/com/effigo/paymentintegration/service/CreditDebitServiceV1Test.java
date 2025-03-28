package com.effigo.paymentintegration.service;

import com.effigo.paymentintegration.entity.CreditDebitEntity;
import com.effigo.paymentintegration.mapper.CreditDebitMapper;
import com.effigo.paymentintegration.mapper.CreditDebitResponseMapper;
import com.effigo.paymentintegration.repository.CreditDebitRepository;
import com.effigo.shared.dto.v1.CreditDebitDtoV1;
import com.effigo.shared.dto.v1.CreditDebitExternalResponseDtoV1;
import com.effigo.shared.dto.v1.CreditDebitResponseDtoV1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CreditDebitServiceV1Test {

	@InjectMocks
	private CreditDebitService creditDebitService;

	@Mock
	private CreditDebitMapper creditDebitMapper;

	@Mock
	private CreditDebitRepository creditDebitRepository;

	@Mock
	private CreditDebitResponseMapper creditDebitResponseMapper;

	@Test
	public void saveCreditDebitDetails(){
		// Prepare test data
		List<CreditDebitDtoV1> creditDebitDtoV1List = new ArrayList<>();
		// Add CreditDebitDtoV1 objects to the list
		CreditDebitDtoV1 creditDebitDtoV1 = CreditDebitDtoV1.builder().companyCode("123").build();
		creditDebitDtoV1List.add(creditDebitDtoV1);

		List<CreditDebitEntity> creditDebitEntityList = new ArrayList<>();
		// Add CreditDebitEntity objects to the list
		CreditDebitEntity creditDebitEntity = CreditDebitEntity.builder().companyCode("123").build();
		creditDebitEntityList.add(creditDebitEntity);

		List<CreditDebitEntity> savedEntities = new ArrayList<>();
		// Add CreditDebitEntity objects that were saved
		savedEntities.add(creditDebitEntity);

		List<CreditDebitResponseDtoV1> responseDtoList = new ArrayList<>();
		// Add CreditDebitResponseDtoV1 objects
		CreditDebitResponseDtoV1 creditDebitResponseDtoV1 = CreditDebitResponseDtoV1.builder().build();
		responseDtoList.add(creditDebitResponseDtoV1);

		// Mock the necessary dependencies
		when(creditDebitMapper.toDomainList(creditDebitDtoV1List)).thenReturn(creditDebitEntityList);
		when(creditDebitRepository.saveAll(creditDebitEntityList)).thenReturn(savedEntities);
		when(creditDebitResponseMapper.toDto(savedEntities)).thenReturn(responseDtoList);

		// Call the method under test
		CreditDebitExternalResponseDtoV1 responseDto = creditDebitService.saveCreditDebitDetails(creditDebitDtoV1List);

		// Verify the results
		Assertions.assertEquals(responseDtoList, responseDto.getCreditDebitResponseDtoV1List());

		// Verify that the mocked methods were called
		verify(creditDebitMapper, times(1)).toDomainList(creditDebitDtoV1List);
		verify(creditDebitRepository, times(1)).saveAll(creditDebitEntityList);
		verify(creditDebitResponseMapper, times(1)).toDto(savedEntities);
	}


}