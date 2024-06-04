package com.todotic.contactlistapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
//Nos ayuda a crear un constructor para requerir ciertos datos al llamar a nuestro modelo new Contact
@RequiredArgsConstructor
//Se require ya que por defecto se necesita un constructor vacio
@NoArgsConstructor
public class Contact {
    //Usamos esta anotacion de Id que viene del paquete jakarta.persistence
    @Id
    //Especificamos que el atributo id sera autoincrementable
    // ya qye utilizaamos la base de datos en memoria h2
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    //Especifica que son abligatorios
    @NonNull
    private String name;
    @NonNull
    private String email;
    @NonNull
    private LocalDateTime createdAt;


}
