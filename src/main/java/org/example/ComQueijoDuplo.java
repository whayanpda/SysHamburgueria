package org.example;

class ComQueijoDuplo extends AdicionalDecorator {
    public ComQueijoDuplo(ItemCardapio burger) { super(burger); }
    public String getDescricao() { return burger.getDescricao() + " + Queijo Duplo"; }
    public double getPreco() { return burger.getPreco() + 3.00; }
}
