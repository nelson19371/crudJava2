package com.crudEjemplo.crudEjemplo.Controller;

import com.crudEjemplo.crudEjemplo.Interface.PersonaInterface;
import com.crudEjemplo.crudEjemplo.Model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @GetMapping(value = "/")
    public String probando(){
        return "Hola Mundo";
    }

    @Autowired
    public PersonaInterface personaInterface;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value="/personas")
    public List<Persona> getPersonas(){
        return personaInterface.findAll();
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/personas")
    public ResponseEntity<Persona> agregar(@RequestBody Persona persona) {
        Persona personaGuardada = personaInterface.save(persona);
        return new ResponseEntity<>(personaGuardada, HttpStatus.CREATED);
    }


}
