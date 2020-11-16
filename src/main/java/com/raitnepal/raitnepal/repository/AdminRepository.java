package com.raitnepal.raitnepal.repository;

import com.raitnepal.raitnepal.model.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminUser, Integer> {
}
