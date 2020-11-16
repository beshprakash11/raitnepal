package com.raitnepal.raitnepal.repository;

import com.raitnepal.raitnepal.model.WebUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebuserRepository extends JpaRepository<WebUser, Integer> {
}
