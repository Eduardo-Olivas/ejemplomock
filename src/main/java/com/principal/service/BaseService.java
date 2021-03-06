package com.principal.service;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;

import com.principal.model.Base;

public interface BaseService<E extends Base, ID extends Serializable> {
    public CompletableFuture<List<E>> findAll();
    public CompletableFuture<E> findById(ID id);
    public CompletableFuture<E> save(E entity);
    public CompletableFuture<E> update(ID id, E entity);
    public CompletableFuture<Boolean> delete(ID id);
}