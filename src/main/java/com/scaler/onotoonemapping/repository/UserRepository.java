package com.scaler.onotoonemapping.repository;

import com.scaler.onotoonemapping.entity.User;
import com.scaler.onotoonemapping.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
