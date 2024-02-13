package com.example.reactiveprogramming.repository;

import com.example.reactiveprogramming.entity.AnimalEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends ReactiveCrudRepository<AnimalEntity, Long> {
}
