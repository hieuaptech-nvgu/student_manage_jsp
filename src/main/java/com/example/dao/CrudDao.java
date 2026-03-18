package com.example.dao;

import java.util.List;

public interface CrudDao<T> {
    void create(T t);
    List<T> getAll();
    T getById(int id);
    void update(T t);
    void delete(int id);
}