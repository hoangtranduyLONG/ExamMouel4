package com.example.exam.service;

import com.example.exam.model.Country;

import java.util.Optional;

public interface ICountryService {
    Iterable<Country> findAllCountries();

    Optional<Country> findById(Long id);

}