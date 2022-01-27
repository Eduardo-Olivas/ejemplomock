package com.principal.controller;

import java.util.concurrent.CompletableFuture;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.principal.dto.TemaReqDTO;
import com.principal.impl.TemaServiceImpl;
import com.principal.model.Tema;

@RestController
@RequestMapping("/api/temas")
public class TemaController {
	
	@Autowired
	TemaServiceImpl srv;
	@Autowired
	ModelMapper mmap;
	
	@GetMapping("")
	public CompletableFuture<ResponseEntity> getAll()  {
		return srv.findAll().thenApply(ResponseEntity::ok);
	}
	
	@GetMapping("{id}")
	public CompletableFuture<ResponseEntity> getOne(@PathVariable("id") Long id){
		return srv.findById(id).thenApply( ResponseEntity::ok );
	}
	
	@PostMapping
	public CompletableFuture<ResponseEntity> save(@RequestBody TemaReqDTO tema ){
		return srv.save(mmap.map( tema, Tema.class )).thenApply(ResponseEntity::ok);
	}
	
	@DeleteMapping("{id}")
	public CompletableFuture<ResponseEntity> delete(@PathVariable("id") Long id){
		return srv.delete(id).thenApply( ResponseEntity::ok );
	}
	
	@PutMapping("{id}")
	public CompletableFuture<ResponseEntity> update(
			@PathVariable("id") Long id,
			@RequestBody TemaReqDTO tema 
			){
		return srv.update(id, mmap.map( tema, Tema.class ) ).thenApply( ResponseEntity::ok );
		
	}
	

}
