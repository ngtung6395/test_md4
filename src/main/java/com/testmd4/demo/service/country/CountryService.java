package com.testmd4.demo.service.country;

import com.testmd4.demo.entity.Country;
import com.testmd4.demo.repository.ICountryRepository;
import com.testmd4.demo.service.country.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService implements ICountryService {
    @Autowired
    private ICountryRepository countryRepository;
    @Override
    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }
}
