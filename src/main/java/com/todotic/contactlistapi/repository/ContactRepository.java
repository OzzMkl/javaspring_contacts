package com.todotic.contactlistapi.repository;

import com.todotic.contactlistapi.entity.Contact;
import org.springframework.data.repository.CrudRepository;
//Extendemos del crudrepository (crear,leeractualizar, etc) que sera el encargado de conectarse a la db
// asignamos el tipo de dato qie sera Contact junto con su primaryKey
public interface ContactRepository extends CrudRepository<Contact, Integer> {
}
