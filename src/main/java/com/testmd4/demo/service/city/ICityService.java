package com.testmd4.demo.service.city;

import com.testmd4.demo.entity.City;

import java.util.Optional;

public interface ICityService {
    Iterable<City> findAll();

    Optional<City> findById(Long id);

    void save(City city);

    void remove(Long id);
}
