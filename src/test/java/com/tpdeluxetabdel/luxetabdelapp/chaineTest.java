package com.tpdeluxetabdel.luxetabdelapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NoeudTest {
    private chaine tete;

    @BeforeEach
    void setUp() {
        tete = new chaine(null); // Tête de liste vide
    }

    @Test
    void testAjouterEtContient() {
        assertFalse(tete.contient("test"));
        tete.ajouterFin("test");
        assertTrue(tete.contient("test"));
    }

    @Test
    void testSupprimerDebut() {
        tete.ajouterFin("un");
        tete.ajouterFin("deux");
        assertEquals("un", tete.supprimerDebut());
        assertFalse(tete.contient("un"));
        assertTrue(tete.contient("deux"));
    }

    @Test
    void testTaille() {
        assertEquals(0, tete.taille());
        tete.ajouterFin("un");
        assertEquals(1, tete.taille());
        tete.ajouterFin("deux");
        assertEquals(2, tete.taille());
    }

    @Test
    void testEstVide() {
        assertTrue(tete.estVide());
        tete.ajouterFin("quelque chose");
        assertFalse(tete.estVide());
    }
}
