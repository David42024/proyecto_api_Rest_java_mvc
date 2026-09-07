package com.sistemas.demo.controller;

import com.sistemas.demo.entities.Persona;
import com.sistemas.demo.service.PersonaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/persona")
@RequiredArgsConstructor
public class PersonaController {
    private final PersonaService personaService;

    @PostMapping
    public void createPersona(@RequestBody Persona person) {
        personaService.creaPersona(person);
    }
}
