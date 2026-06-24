package com.trustcare.management.repository;

import com.trustcare.management.model.Housekeeping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HousekeepingRepository extends JpaRepository<Housekeeping, Long> {

}