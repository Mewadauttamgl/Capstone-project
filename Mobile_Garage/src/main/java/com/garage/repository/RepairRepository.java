package com.garage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.garage.model.Repair;

@Repository
public interface RepairRepository extends JpaRepository<Repair, Integer> {

}
