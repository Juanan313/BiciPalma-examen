package org.mvpigs.Bicipalma;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * EstacionTest
 */
public class EstacionTest {

    Estacion estacion = new Estacion(1, "Manacor", 6);


    @Test
    public void constructorTest() {

        assertEquals(estacion.getDireccion(), "Manacor");
        assertEquals(estacion.getId(), 1);
        assertEquals(estacion.getNumeroAnclajes(), 6);

    }
    @Test
    public void consultarEstacionTest() {

        assertEquals(estacion.consultarEstacion(),"Id: 1, Direccion: Manacor, numero de anclajes: 6");
        
    }
}