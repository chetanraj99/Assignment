package com.example.reactive.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reactive.crud.dao.ItemDao;
import com.example.reactive.crud.model.Item;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemDao itemDao;

	@Override
	public Flux<Item> getAllItems() {
		// TODO Auto-generated method stub
		return itemDao.findAll();
	}

	@Override
	public Mono<Item> getItemById(String id) {
		// TODO Auto-generated method stub
		return itemDao.findById(id);
	}

	@Override
	public Mono<Item> createItem(Item item) {
		// TODO Auto-generated method stub
		return itemDao.save(item);
	}

	@Override
	public Mono<Void> deleteItem(String id) {
		// TODO Auto-generated method stub
		return itemDao.deleteById(id);
	}

	@Override
	public Flux<Item> getItemsByName(String name) {
		// TODO Auto-generated method stub
		return itemDao.findByName(name);
	}

}
