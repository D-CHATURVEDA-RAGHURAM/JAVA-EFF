package com.effigo.paymentintegration.mapper;

import java.util.List;

public interface IEntityMapper<D, E>{
	D toDto(E e);

	E toDomain(D d);

	List<D> toDto(List<E> eList);

	List<E> toDomain(List<D> dList);
	
	//E toStr(List<D> dList);
}
