package org.example;

public class ComMaioneseTrufada extends AdicionalDecorator{
    public ComMaioneseTrufada(ItemCardapio burger) { super(burger); }
    public String getDescricao() { return burger.getDescricao() + " + Com Maionese Trufada"; }
    public double getPreco() { return burger.getPreco() + 3.50; }
}
