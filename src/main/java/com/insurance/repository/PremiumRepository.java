package com.insurance.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.entity.PremiumDetails;

public interface PremiumRepository extends JpaRepository<PremiumDetails, Long> {

}
