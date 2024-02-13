package com.example.reactiveprogramming.service;

import com.example.reactiveprogramming.entity.AnimalEntity;
import com.example.reactiveprogramming.repository.AnimalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AnimalService {
    private final AnimalRepository animalRepository;

    public Mono<AnimalEntity> getById(Long id) {
        return animalRepository.findById(id);
    }

    public Flux<AnimalEntity> getAll() {
        return animalRepository.findAll();
    }

    public Mono<AnimalEntity> save(AnimalEntity animalEntity) {
        return animalRepository.save(animalEntity);
    }

}
