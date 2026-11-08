package com.csit321g3._notfound.clutch.repository;
import com.csit321g3._notfound.clutch.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
}