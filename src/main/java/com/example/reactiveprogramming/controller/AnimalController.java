package com.example.reactiveprogramming.controller;

import com.example.reactiveprogramming.entity.AnimalEntity;
import com.example.reactiveprogramming.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reactive/animals")
public class AnimalController {

    private final AnimalService animalService;

    @GetMapping("/{id}")
    public Mono<AnimalEntity> getById(@PathVariable Long id) {
        return animalService.getById(id);
    }

    @GetMapping
    public Flux<AnimalEntity> getAll(){
        return animalService.getAll();
    }

    @PostMapping()
    public Mono<AnimalEntity> save(@RequestBody AnimalEntity animalEntity) {
        return animalService.save(animalEntity);
    }

}
