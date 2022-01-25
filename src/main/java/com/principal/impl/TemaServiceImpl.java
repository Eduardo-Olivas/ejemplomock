package com.principal.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.principal.model.Tema;

import com.principal.repo.BaseRepository;
import com.principal.repo.UserRepository;
import com.principal.service.TemaService;
import com.principal.service.UserService;

@Service
public class TemaServiceImpl extends BaseServiceImpl<Tema, Long> implements TemaService {

    @Autowired
    private UserRepository autorRepository;

    public TemaServiceImpl(BaseRepository<Tema, Long> baseRepository) {
        super(baseRepository);
    }
}