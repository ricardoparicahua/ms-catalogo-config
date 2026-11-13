package com.ejemplo.mscatalogo.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CategoriaTest {

    @Test
    void asignaYRecuperaNombre() {
        Categoria categoria = new Categoria();
        categoria.setNombre("Electronica");

        assertEquals("Electronica", categoria.getNombre());
    }
}
