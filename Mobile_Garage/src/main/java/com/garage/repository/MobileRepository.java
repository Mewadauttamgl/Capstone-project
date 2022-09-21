package com.garage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.garage.model.PhoneData;

@Repository
public interface MobileRepository extends JpaRepository<PhoneData,String> {

	

}
