package com.raitnepal.raitnepal.repository;

import com.raitnepal.raitnepal.model.HomePage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<HomePage, Integer> {
}
