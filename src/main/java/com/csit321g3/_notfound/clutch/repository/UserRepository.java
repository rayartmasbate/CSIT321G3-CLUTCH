package com.csit321g3._notfound.clutch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.csit321g3._notfound.clutch.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}