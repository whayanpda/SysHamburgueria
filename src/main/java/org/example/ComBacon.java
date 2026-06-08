package org.example;

class ComBacon extends AdicionalDecorator {
    public ComBacon(ItemCardapio burger) { super(burger); }
    public String getDescricao() { return burger.getDescricao() + " + Bacon Crocante"; }
    public double getPreco() { return burger.getPreco() + 4.50; }
}
