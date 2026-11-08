package com.csit321g3._notfound.clutch.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface EnrollmentRepository extends JpaRepository<EnrollmentEntity, Integer> {

    
}
