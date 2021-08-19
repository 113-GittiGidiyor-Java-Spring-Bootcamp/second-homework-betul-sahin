package com.betulsahin.springbootcamp.schoolmanagementsystemdemov2.service;

import java.util.List;

public interface BaseService<T> {
    List<T> findAll();
    T findById(Long id);
    T save(T object);
    void deleteById(Long id);
}
