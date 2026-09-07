package com.sistemas.demo.service;

import com.sistemas.demo.entities.Persona;
import com.sistemas.demo.repository.PersonaRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonaService {
    private final PersonaRepository personaRepo;

    public void creaPersona(Persona person) {
        personaRepo.save(person);
    }
}
