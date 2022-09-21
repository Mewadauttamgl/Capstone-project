package com.garage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.garage.model.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration,Integer> {

	Registration findBycEmail(String email);
}
