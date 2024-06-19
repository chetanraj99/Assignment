package com.example.reactive.crud.service;

import com.example.reactive.crud.model.Item;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ItemService {
	
	public Flux<Item> getAllItems();
	public Mono<Item> getItemById(String id);
	public Mono<Item> createItem(Item item);
	public Mono<Void> deleteItem(String id);
	public Flux<Item> getItemsByName(String name);

}
