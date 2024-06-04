package com.todotic.contactlistapi.controller;

import com.todotic.contactlistapi.entity.Contact;
import com.todotic.contactlistapi.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Anotacion para poder ingresar a los endpoints (metodos de este controlador)
//tambien asignamos una ruta base
@RequestMapping("/api/contacts")
//asignamos esta anotacion para indicar que se comportara como un controlador
// se esoge rest porque retorna json por defecto
@RestController
public class ContactController {

    @Autowired
    //delegamos la inicializacion de este contenedor al spring
    private ContactRepository contactRepository;

    //Especificamos que sera un endpoint
    @GetMapping
    //Metodo para poder listar todos los contactos
    public Iterable<Contact> list() {
         return contactRepository.findAll();
    }

    //aqui si especificamos que se obtendra un valor de la url
    @GetMapping("{id}")
    //tambien lo especificamos en el metodo
    public Contact get(@PathVariable Integer id){
        return contactRepository
                .findById(id)
                //Si no lo encuentra retornamos nulo
                .orElse(null);
    }
}
