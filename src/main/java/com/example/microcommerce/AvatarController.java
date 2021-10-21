package com.example.microcommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.microcommerce.CharacterDao;
import com.example.microcommerce.CharacterClass;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class AvatarController {
    String name;
    int life;
    int id;

    @Autowired
    private CharacterDao characterDao;


    @RequestMapping(value = "/characters", method = RequestMethod.GET)
    public Iterable<CharacterClass> listeCharacter() {
        Iterable<CharacterClass> character = characterDao.findAll();

        return character;
    }


    @GetMapping("/")
    public String index() {
        return "Avatar";

    }


    @GetMapping("/characters/{id}")
    public Optional<CharacterClass> getCharacter(@PathVariable int id) {
        return characterDao.findById(id);
    }


    @PostMapping("/characters")
    public void setCharacter(@RequestBody CharacterClass character) {
        characterDao.save(character);

    }

    @PutMapping("/character/{id}")
    public void putCharacter(@RequestBody CharacterClass character, @PathVariable int id) {
        character.setId(id);
        characterDao.save(character);
    }

    @DeleteMapping("/character/{id}")
    public void delete(@PathVariable int id) {
        characterDao.deleteById(id);
    }
}
