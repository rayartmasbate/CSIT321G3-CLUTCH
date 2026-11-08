package com.csit321g3._notfound.clutch.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.csit321g3._notfound.clutch.entity.EnrollmentEntity;

@Repository 
public interface EnrollmentRepository extends JpaRepository<EnrollmentEntity, Integer> {

    
}
