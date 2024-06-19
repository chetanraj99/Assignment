package com.example.reactive.webclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/client")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/items")
	public Flux<Item> getAllItems() {
		return itemService.getAllItems();
	}
	
	@PostMapping("/items")
	public Mono<Item> createItem(@RequestBody Item item) {
		return itemService.createItem(item);
	}
	
	@GetMapping("/items/{name}")
	public Flux<Item> getItemsByName(@PathVariable String name) {
		return itemService.getItemsByName(name);
	}
	
	@GetMapping("/items/search/{id}")
	public Mono<Item> getItemById(@PathVariable String id) {
		return itemService.getItemById(id);
	}
	
	@DeleteMapping("/item/{id}")
	public Mono<Void> deleteItem(@PathVariable String id) {
		return itemService.deleteItem(id);
	}
	
	@GetMapping("/backpressure")
	public void callBackPressure() {
		itemService.consumeNumberStream();
	}
	

}
