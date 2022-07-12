package com.example.exam.service;
import com.example.exam.model.City;

import java.util.List;
import java.util.Optional;

public interface ICityService {
    List<City> FindAllCities();

    Optional<City> findById(Long id);

    City save(City city);

    void remove(Long id);
}
