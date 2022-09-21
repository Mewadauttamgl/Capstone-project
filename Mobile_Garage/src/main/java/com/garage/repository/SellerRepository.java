package com.garage.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.garage.model.Seller;

@Repository

public interface SellerRepository extends JpaRepository<Seller,Integer> {

}

