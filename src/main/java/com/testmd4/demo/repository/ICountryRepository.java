package com.testmd4.demo.repository;

import com.testmd4.demo.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICountryRepository extends JpaRepository<Country,Long> {
}
