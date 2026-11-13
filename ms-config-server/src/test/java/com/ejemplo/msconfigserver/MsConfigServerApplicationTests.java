package com.ejemplo.msconfigserver;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class MsConfigServerApplicationTests {

    @Test
    void clasePrincipalDisponible() {
        assertNotNull(MsConfigServerApplication.class);
    }
}
