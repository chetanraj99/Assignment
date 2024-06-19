package com.example.reactive.crud.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.reactive.crud.model.Item;

import reactor.core.publisher.Flux;

public interface ItemDao extends ReactiveMongoRepository<Item, String>{
	
	public Flux<Item> findByName(String name);

}
