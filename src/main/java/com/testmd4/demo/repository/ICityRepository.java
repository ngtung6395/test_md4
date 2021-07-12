package com.testmd4.demo.repository;

import com.testmd4.demo.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICityRepository extends JpaRepository<City,Long> {
}
