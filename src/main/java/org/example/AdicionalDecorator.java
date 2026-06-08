package org.example;

abstract class AdicionalDecorator implements ItemCardapio {
    protected ItemCardapio burger;
    public AdicionalDecorator(ItemCardapio burger) { this.burger = burger; }
}
