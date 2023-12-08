package com.devs4j.hello.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component; // Agregar esta importación

@Component // Agregar esta anotación
public class Nido {

    @Autowired
    @Qualifier("pajarito")
    private Animal animal;

    private static final Logger log = LoggerFactory.getLogger(Nido.class);

    public void imprimir() {
        log.info("Mi nido tiene el animal: {}", animal.getNombre()); // Corregir el formato del log
    }
}
