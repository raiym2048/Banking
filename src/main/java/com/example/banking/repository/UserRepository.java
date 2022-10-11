package com.example.banking.repository;

import com.example.banking.models.Users1;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users1, Long> {
}
