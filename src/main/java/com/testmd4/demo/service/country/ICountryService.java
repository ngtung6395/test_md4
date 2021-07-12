package com.testmd4.demo.service.country;

import com.testmd4.demo.entity.City;
import com.testmd4.demo.entity.Country;

public interface ICountryService {
    Iterable<Country> findAll();
}
