package com.example.microcommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AvatarController {
String name;
int life;
int id;

@Autowired
private CharacterDao characterDao;

    @GetMapping("/")
    public String index() {
        return "Avatar";

    }

 @GetMapping("/characters")
    public List<CharacterClass> getList() {


return characterDao.findAll();
 }
    @GetMapping("/characters/{id}")
    public CharacterClass getCharacter(@PathVariable int id){
        return characterDao.findById(id);
    }

    
@PostMapping("/characters")
    public void setCharacter(@RequestBody CharacterClass character) {
    characterDao.save(character);

}
@PutMapping("/character/{id}")
    public void putCharacter(@RequestBody CharacterClass character, @PathVariable int id) {
       characterDao.update(character, id);
}
@DeleteMapping("/character/{id}")
    public void delete(@PathVariable int id) {
characterDao.delete(id);
}
}
