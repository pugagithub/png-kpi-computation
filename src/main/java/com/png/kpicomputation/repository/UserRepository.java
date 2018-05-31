package com.png.kpicomputation.repository;

import java.util.List;

import com.png.kpicomputation.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByLastName(String lastName);
}