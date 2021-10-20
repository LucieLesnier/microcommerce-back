package com.example.microcommerce;

import java.util.List;

public interface CharacterDao {
public List<CharacterClass> findAll();
CharacterClass findById(int id);
void save(CharacterClass characters);
void update(CharacterClass updateCharacter, int id);
void delete(int id);
}
