package com.example.noteservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.noteservice.exceptions.NoteNotFoundException;
import com.example.noteservice.model.Note;
import com.example.noteservice.service.NoteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/note")
@Validated
public class NoteController {
	
	@Autowired
	NoteService service;
	
	
	//@ResponseStatus(HttpStatus.OK)
	@GetMapping("/display")
	public ResponseEntity<List<Note>> getAllNotes(){
		return new ResponseEntity(service.displayNotes(), HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Note> addNote(@RequestBody @Valid Note note) {
		return new ResponseEntity(service.addNote(note), HttpStatus.CREATED);
	}
	
	@GetMapping("/search/{noteId}")
	public ResponseEntity<List<Note>> searchNotes(@PathVariable int noteId){
		List<Note> data = service.searchNote(noteId);
		if(data.isEmpty())
			throw new NoteNotFoundException();
		else
			return new ResponseEntity(service.searchNote(noteId), HttpStatus.OK);
	
			
	}
	
	@DeleteMapping("/del/{noteId}")
	public ResponseEntity<Boolean> deleteNotes(@PathVariable int noteId) {
		boolean isfound = service.deleteNote(noteId);
		if(isfound)
			return new ResponseEntity(true, HttpStatus.NO_CONTENT);
		else
			throw new NoteNotFoundException();
	}

}
