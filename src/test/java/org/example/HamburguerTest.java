package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HamburguerTest {

    private static final double DELTA = 0.001;

    @Test
    void deveCriarHamburguerBaseComDescricaoEPreco() {
        ItemCardapio hamburguer = new HamburguerBase("Brioche", "Angus");

        assertEquals("Burger (Brioche + Angus)", hamburguer.getDescricao());
        assertEquals(22.00, hamburguer.getPreco(), DELTA);
    }

    @Test
    void deveAdicionarBaconAoHamburguer() {
        ItemCardapio hamburguer = new ComBacon(new HamburguerBase("Australiano", "Frango"));

        assertEquals("Burger (Australiano + Frango) + Bacon Crocante", hamburguer.getDescricao());
        assertEquals(26.50, hamburguer.getPreco(), DELTA);
    }

    @Test
    void deveAdicionarQueijoDuploAoHamburguer() {
        ItemCardapio hamburguer = new ComQueijoDuplo(new HamburguerBase("Integral", "Vegetariano"));

        assertEquals("Burger (Integral + Vegetariano) + Queijo Duplo", hamburguer.getDescricao());
        assertEquals(25.00, hamburguer.getPreco(), DELTA);
    }

    @Test
    void deveAdicionarMaioneseTrufadaAoHamburguer() {
        ItemCardapio hamburguer = new ComMaioneseTrufada(new HamburguerBase("Brioche", "Angus"));

        assertEquals("Burger (Brioche + Angus) + Com Maionese Trufada", hamburguer.getDescricao());
        assertEquals(25.50, hamburguer.getPreco(), DELTA);
    }

    @Test
    void deveCombinarAdicionaisSomandoPrecosEMantendoDescricao() {
        ItemCardapio hamburguer = new ComMaioneseTrufada(
                new ComQueijoDuplo(
                        new ComBacon(
                                new HamburguerBase("Brioche", "Angus")
                        )
                )
        );

        assertEquals(
                "Burger (Brioche + Angus) + Bacon Crocante + Queijo Duplo + Com Maionese Trufada",
                hamburguer.getDescricao()
        );
        assertEquals(33.00, hamburguer.getPreco(), DELTA);
    }
}
