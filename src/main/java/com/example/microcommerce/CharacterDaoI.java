//package com.example.microcommerce;
//
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//@Repository
//public class CharacterDaoI implements CharacterDao {
//
// private static  List<CharacterClass> characters= new ArrayList<>();
//static {
//
//    characters.add(new CharacterClass("Hero", 100, 1));
//    characters.add(new CharacterClass("Wizard", 100, 2));
//    characters.add(new CharacterClass("Warrior", 100, 3));
//
//}
//    public List<CharacterClass> findAll() {
//return characters;
//}
//
//    @Override
//    public CharacterClass findById(int id) {
//        return characters.get(id-1);
//    }
//
//    @Override
//    public void save(CharacterClass character) {
//    characters.add(character);
//    }
//
//    @Override
//    public void update(CharacterClass updateCharacter, int id) {
//        for (CharacterClass character : characters){
//            if (character.getId() == id){
//                character.setName(updateCharacter.getName());
//            }
//        }
//    }
//    @Override
//    public void delete(int id) {
//        characters.removeIf(character -> character.getId() == id);
//    }
//
//}
